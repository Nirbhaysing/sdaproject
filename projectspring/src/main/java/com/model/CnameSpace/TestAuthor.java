package com.model.CnameSpace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuthor {

	public static void main(String[] args) {
     
		ApplicationContext context=new ClassPathXmlApplicationContext("author.Xml");
		
		Author atv=(Author)context.getBean("aut");
		System.out.println(atv);
				

	}

}
