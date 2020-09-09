package com.spring.constructor.confusion;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ConstrutorConfusionTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		Product product = factory.getBean("product", Product.class);
		System.out.println(product);
		
	}

}
