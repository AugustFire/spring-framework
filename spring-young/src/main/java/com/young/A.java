package com.young;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Zongxu.Yang
 * create at 2021/2/24
 */
@Component
public class A implements BeanFactoryAware, ApplicationContextAware {
	public A() {
		System.out.println("SOS");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Debug beanFactory" + beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Debug applicationContext" + applicationContext);
	}
}
