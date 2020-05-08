package com.nineleaps.spring.beansutility;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.spring.model.Address;
import com.nineleaps.spring.model.Employee;

public class BeanUtility {
	
	  public static void main(String[] args) {
	  
	  
	  ConfigurableApplicationContext context = new
	  ClassPathXmlApplicationContext("applicationContext.xml");
	  //ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml"); 
	  Employee obj = context.getBean("emp", Employee.class); 
	  System.out.println(obj);
	  
	  Address add = context.getBean("address", Address.class);
	  
	  System.out.println(context.getBeanFactory().getType("emp"));
	  
	  context.registerShutdownHook();
	  
	  }
	 

	/**
	 * new FileSystemResource("src/main/resources/applicationContext.xml")
	 * 
	 * BeanFactory ConfigurableBeanFactory XmlBeanFactory registerSingleton()
	 * getBeanFactory() DefaultListableBeanFactory registerBeanDefinition()
	 * BeanDefination
	 * 
	 */

	/*
	 * @SuppressWarnings("deprecation") public static void main(String[] args) {
	 * 
	 * ConfigurableBeanFactory factory = new XmlBeanFactory(new
	 * ClassPathResource("applicationContext.xml"));
	 * System.out.println(factory.getBean("employee"));
	 * 
	 * DefaultListableBeanFactory f = new DefaultListableBeanFactory(factory);
	 * 
	 * ConfigurableApplicationContext context = new FileSystemXmlApplicationContext(
	 * "classpath:applicationContext.xml"); DefaultListableBeanFactory f1 =
	 * (DefaultListableBeanFactory) context.getBeanFactory();
	 * 
	 * Employee obj = (Employee) f.getBean("employee");
	 * 
	 * Address add1 = (Address) f.getBean("address");
	 * System.out.println(f.isPrototype("address")); f.registerSingleton("address",
	 * add1); System.out.println(f.isSingleton("address"));
	 * 
	 * AbstractBeanDefinition def =
	 * BeanDefinitionBuilder.rootBeanDefinition(Address.class).setLazyInit(true)
	 * .addPropertyValue("address_line1", "Rajsthan").getBeanDefinition();
	 * 
	 * f1.registerBeanDefinition("addressBD", def);
	 * System.out.println(f1.getBean("addressBD")); }
	 */

	/**
	 * **Java Based Configuration
	 * 
	 * @Configuration
	 * @Bean
	 * @Import
	 * @DependsOn
	 */

	
	/*
	 * public static void main(String[] args) { ApplicationContext ctx = new
	 * AnnotationConfigApplicationContext(JavaBeanConfig.class);
	 * 
	 * Address add = ctx.getBean("address", Address.class);
	 * System.out.println(add.getAddress_line1() + " -- " + add.getAddress_line2());
	 * Employee emp = ctx.getBean("employee", Employee.class);
	 * System.out.println(emp.getE_name()); }
	 */
	 
	 
}