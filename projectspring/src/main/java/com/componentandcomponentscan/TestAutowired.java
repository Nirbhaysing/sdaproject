package com.componentandcomponentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.autowired.AppConfig;
import com.autowired.Employee;

public class TestAutowired {

	public static void main(String[] args) {

		ApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);

		Employee e=con.getBean(Employee.class);
		e.display();
	
	}

}
