package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Employee e=(Employee)context.getBean("emp");
    System.out.println(e);
	}
}
