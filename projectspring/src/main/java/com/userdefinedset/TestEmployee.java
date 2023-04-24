package com.userdefinedset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {

		Set <Employee> lset=new HashSet<Employee>();
		lset.add(new Employee(101,"Suraj",12300));
		lset.add(new Employee(103,"yash",23300));
		lset.add(new Employee(102,"Mahesh",34300));
		
		System.out.println(lset);
		
		Employee e=new Employee(105,"Mohit",45300);
		lset.add(e);
		
		System.out.println(lset);
		System.out.println("Using Iterator");
		Iterator<Employee> itr=lset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using for each");
		for(Employee i:lset) {
			System.out.println(i);
		}
	}
}
