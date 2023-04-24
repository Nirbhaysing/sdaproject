package com.symbiosis.springbasicdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.model.Actor;

@SpringBootApplication
@ComponentScan({"com.symbiosis.springbasicdemo","com.model"})
public class SpringbasicdemoApplication {

	public static void main(String[] args) {
ApplicationContext context= SpringApplication.run(SpringbasicdemoApplication.class, args);
	Actor a= context.getBean(Actor.class);
	a.show();
	
	}

}
