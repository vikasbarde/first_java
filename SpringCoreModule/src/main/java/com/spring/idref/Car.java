package com.spring.idref;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {

	private String beanId;
	IEngine engine;

	public Car(String beanId) {
		this.beanId = beanId;
	}

	public void drive() {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		engine = factory.getBean(beanId, IEngine.class);
		if (engine.startUp() == 1) {
			System.out.println(beanId + " strted successfully!");
		} else {
			System.out.println(beanId + " not strted!");
		}

	}

}
