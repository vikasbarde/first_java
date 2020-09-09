package com.spring.nested.bean.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class NestedBeanTest {

	public static void main(String[] args) {
		BeanFactory childFactory = new XmlBeanFactory(new ClassPathResource("child-context.xml"));
		BeanFactory parentFactory = new XmlBeanFactory(new ClassPathResource("parent-context.xml"),childFactory);
		A a = parentFactory.getBean("parent", A.class);
		System.out.println(a);
		
	}

}
