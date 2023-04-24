package com.namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("codder.Xml");

		 Codder df=(Codder)context.getBean("coder");
		 
		 System.out.println(df);

	}

}
