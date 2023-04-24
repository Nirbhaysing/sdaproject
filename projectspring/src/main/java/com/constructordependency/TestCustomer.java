package com.constructordependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("Customer.Xml");
		 
		 Customer c=(Customer)context.getBean("emp");
		 System.out.println(c);
		 
		 Customer c1=(Customer)context.getBean("emp1");
		 System.out.println(c1);
		 
	}

	
	
}
