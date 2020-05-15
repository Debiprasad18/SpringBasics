package com.nineleaps.spring.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class Bean1 implements BeanPostProcessor {
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

	@Nullable
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization : " + beanName);
		return bean;
	}

	@Nullable
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization : " + beanName);
		return bean;
	}

	public void init() {
		System.out.println("Inside init method Bean1");
	}

	public void destroy() {
		System.out.println("Inside destroy method Bean1");
	}
}
