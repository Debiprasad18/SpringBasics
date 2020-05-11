package com.nineleaps.spring.model;

public class Bean2 {

	Bean1 bean1;

	String name;
	/*
	 * public Bean2(Bean1 bean1) { this.bean1 = bean1; }
	 */
	public Bean2() {
	}

	public Bean1 getBean1() {
		return bean1;
	}

	public void setBean1(Bean1 bean1) {
		this.bean1 = bean1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bean2 [bean1=" + bean1 + ", name=" + name + "]";
	}	
}
