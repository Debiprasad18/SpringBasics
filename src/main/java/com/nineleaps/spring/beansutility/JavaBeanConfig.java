package com.nineleaps.spring.beansutility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

import com.nineleaps.spring.model.Address;
import com.nineleaps.spring.model.Employee;

//@Import(value={Address.class})
//@ImportResource( { "service.xml" } )  
@Configuration
public class JavaBeanConfig {
	
	@Bean(name="addrs")
	@Scope("singleton")
	//@Scope("prototype")
	//@Scope(value =WebApplicationContext.SCOPE_SESSION)
	//@Scope(value =WebApplicationContext.SCOPE_REQUEST)
	//@Scope(value =WebApplicationContext.SCOPE_APPLICATION)
	@Order(1)
	public Address address() {
		return new Address("BLR","KA");
	}
	
	//@DependsOn(value="address")
	@Bean(value = "empl")
	@Order(2)
	@Description("This bean is for address object")
	public Employee employee() {
		return new Employee(null,null,null);
	}
	
	@Bean
	public List<String> companyList(){
		List<String> list = new ArrayList<>();
		list.add("Nineleaps");
		list.add("Google");
		list.add("Apple");
		return list;
	}
	
}
