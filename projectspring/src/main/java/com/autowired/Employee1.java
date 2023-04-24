package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee1 {
 @Autowired
	Address1 add;

public Employee1() {
	super();
	// TODO Auto-generated constructor stub
}

public Address1 getAdd() {
	return add;
}

public void setAdd(Address1 add) {
	this.add = add;
}

void display() {
	System.out.println("Employee Information");
	add.showAddress1();
}  
}
