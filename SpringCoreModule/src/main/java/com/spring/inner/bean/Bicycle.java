package com.spring.inner.bean;

public class Bicycle {
	private String manufacturer;
	private Chain chain;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Chain getChain() {
		return chain;
	}
	public void setChain(Chain chain) {
		this.chain = chain;
	}
	@Override
	public String toString() {
		return "Bicycle [manufacturer=" + manufacturer + ", chain=" + chain + "]";
	}
	
	
	
}
