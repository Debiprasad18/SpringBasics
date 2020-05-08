package com.nineleaps.spring.beansutility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import com.nineleaps.spring.model.Address;
import com.nineleaps.spring.model.Employee;

//@Import(value={Address.class})
//@ImportResource( { "service.xml" } )  
@Configuration
public class JavaBeanConfig {
	
	@Bean
	@Scope("singleton")
	//@Scope("prototype")
	//@Scope(value =WebApplicationContext.SCOPE_SESSION)
	//@Scope(value =WebApplicationContext.SCOPE_REQUEST)
	//@Scope(value =WebApplicationContext.SCOPE_APPLICATION)
	public Address address() {
		return new Address("BLR","KA");
	}
	
	//@DependsOn(value="address")
	@Bean
	
	public Employee employee() {
		return new Employee("TEST_EMP",null,null);
	}
}
