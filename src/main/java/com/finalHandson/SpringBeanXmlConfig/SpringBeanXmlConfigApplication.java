package com.finalHandson.SpringBeanXmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.finalHandson.SpringBeanXmlConfig.beans.Address;
import com.finalHandson.SpringBeanXmlConfig.beans.Details;


public class SpringBeanXmlConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		Details details = (Details) context.getBean("details");
		Address address = (Address) context.getBean("address");
		System.out.println("Details: " + details.toString());
		System.out.println("Address: " + address.toString());
	}

}
