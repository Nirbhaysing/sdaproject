package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
@Autowired
	Address1 add;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address1 getAdd() {
		return add;
	}

	public void setAdd(Address1 add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee Information");
		add.showAddress1();

	}
	
}
