package com.SetterObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.constructordependency.Customer;

public class TestSetterObjectjava {
	public static void main(String[] args) {
		
	
	 ApplicationContext context=new ClassPathXmlApplicationContext("laptop.Xml");

	 Laptop l=(Laptop)context.getBean("lap");
	l.display();
	
	}

}
