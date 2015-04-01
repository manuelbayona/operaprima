package com.operaprima.mock;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Stormtroopers
 *
 */
public class MockPostProcessor implements BeanPostProcessor, ApplicationContextAware {

	private ApplicationContext applicationContext;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {

		if (bean.getClass().isAnnotationPresent(Mockeable.class) && mockMode()) {

			try {

				final Map<String, Object> mockBeans = applicationContext.getBeansWithAnnotation(Mock.class);
				for (final Field field : bean.getClass().getDeclaredFields()) {

					for (final Object mockBean : mockBeans.values()) {
						final Class<?> fieldType = field.getType();
						if (fieldType.isAssignableFrom(mockBean.getClass())) {
							field.setAccessible(true);
							field.set(bean, mockBean);
							break;
						}
					}
				}

			} catch (final Exception e) {
				System.err.println("No se pudo poner al bean [" + beanName + "] en modo mock");
			}

		}

		return bean;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {
		return bean;
	}

	/**
	 * @return boolean
	 */
	private boolean mockMode() {
		final Properties aplicacionProperties = applicationContext.getBean("aplicacionProperties", Properties.class);
		return "on".equals(aplicacionProperties.getProperty("mock.mode"));
	}

}
