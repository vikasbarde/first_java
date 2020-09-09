package com.spring.inner.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InnerBeanTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		Bicycle cyBicycle = factory.getBean("bicycle", Bicycle.class);
		System.out.println(cyBicycle);
	}

}
