package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	@Autowired
	Movie m;
	
	public  void show()
	{
		System.out.println("Jackie Shroff");
		System.out.println("Shushant Singh");
		m.movieName();
	}
}
