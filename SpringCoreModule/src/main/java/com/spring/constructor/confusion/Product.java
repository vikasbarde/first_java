package com.spring.constructor.confusion;

import java.beans.ConstructorProperties;

public class Product {
	private int pid;
	private String productName;
	private double price;
	@ConstructorProperties({"pid","productName"})
	public Product(int pid, String productName) {
		this.pid = pid;
		this.productName = productName;
	}
	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
