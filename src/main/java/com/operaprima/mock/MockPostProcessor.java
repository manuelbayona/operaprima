package com.operaprima.mock;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MockPostProcessor implements BeanPostProcessor,
		ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, final String beanName)
			throws BeansException {
		
		if (bean.getClass().isAnnotationPresent(Mockeable.class) && mockMode()) {
			
			try {
				
				Map<String,Object> mockBeans = applicationContext.getBeansWithAnnotation(Mock.class);
				for (final Field field : bean.getClass().getDeclaredFields()) {

					for (Object mockBean : mockBeans.values()) {
						Class<?> fieldType = field.getType();
						if (fieldType.isAssignableFrom(mockBean.getClass())) {
							field.setAccessible(true);
							field.set(bean, mockBean);
							break;
						}
					}
				}
			
			} catch(Exception e) {
				System.err.println("No se pudo poner al bean [" + beanName + "] en modo mock");
			}
			
		}
		
		return bean;
		
	}

	@Override
	public Object postProcessBeforeInitialization(final Object bean, final String beanName)
			throws BeansException {
		return bean;
	}
	
	private boolean mockMode() {
		Properties aplicacionProperties = applicationContext.getBean("aplicacionProperties", Properties.class);
		return "on".equals(aplicacionProperties.getProperty("mock.mode"));
	}

}
