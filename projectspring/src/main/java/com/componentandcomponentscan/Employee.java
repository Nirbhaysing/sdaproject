package com.componentandcomponentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	Address add;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee Information");
		add.showAddress();

	}
	

}
