package com.operaprima.commons.utils.dozer;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Javier Lacalle
 *
 */
@Component
public class DozerUtils implements IDozerUtils {

	@Autowired
	private Mapper mapper;

	@Override
	public List<?> parseList(final List<?> listToConvert, final Class<?> typeToConvert) {

		final List<Object> convertedList = new ArrayList<Object>();

		for (final Object object : listToConvert) {
			convertedList.add(mapper.map(object, typeToConvert));
		}

		return convertedList;
	}
}
