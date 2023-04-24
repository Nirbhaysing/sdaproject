package com.modelspringcollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestActor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("actor.Xml");

		Actor act = (Actor) context.getBean("actor");
System.out.println(act);
	}
}
