package com.nineleaps.spring.model;

public class Bean1 {
	Bean2 bean2;
	
	String name;

	public Bean1() {
	}

	public Bean2 getBean2() {
		return bean2;
	}

	public void setBean2(Bean2 bean2) {
		this.bean2 = bean2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bean1 [bean2=" + bean2 + ", name=" + name + "]";
	}
	/*
	 * public Bean1(Bean2 bean2) { this.bean2 = bean2; }
	 */


}
