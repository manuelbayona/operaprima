package com.operaprima.services.dao.repositories.utils;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mapping.model.MappingException;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.util.ReflectionUtils;

import com.operaprima.commons.dao.config.SpringMongoConfig;

@SuppressWarnings("rawtypes")
public class CascadingMongoEventListener extends AbstractMongoEventListener {

	@Autowired
	SpringMongoConfig springMongoConfig;

	@Override
	public void onBeforeConvert(final Object source) {
		ReflectionUtils.doWithFields(source.getClass(), new ReflectionUtils.FieldCallback() {

			@Override
			public void doWith(final Field field) throws IllegalArgumentException, IllegalAccessException {
				ReflectionUtils.makeAccessible(field);

				if (field.isAnnotationPresent(DBRef.class) && field.isAnnotationPresent(CascadeSave.class)) {
					final Object fieldValue = field.get(source);

					final DbRefFieldCallback callback = new DbRefFieldCallback();

					ReflectionUtils.doWithFields(fieldValue.getClass(), callback);

					if (!callback.isIdFound()) {
						throw new MappingException("Cannot perform cascade save on child object without id set");
					}

					springMongoConfig.createMongoOperation().save(fieldValue);
				}
			}
		});
	}

	private static class DbRefFieldCallback implements ReflectionUtils.FieldCallback {
		private boolean idFound;

		@Override
		public void doWith(final Field field) throws IllegalArgumentException, IllegalAccessException {
			ReflectionUtils.makeAccessible(field);

			if (field.isAnnotationPresent(Id.class)) {
				idFound = true;
			}
		}

		public boolean isIdFound() {
			return idFound;
		}
	}
}