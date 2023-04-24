package com.SetterObject;

public class Laptop {
	private int id;
	private String name;
	private Harddisk harddisk;
	
	public Laptop() {
		super();
	}
	public Laptop(int id, String name, Harddisk harddisk) {
		super();
		this.id = id;
		this.name = name;
		this.harddisk = harddisk;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Harddisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}
	public void display() {
		System.out.println(id+" "+name+" "+harddisk);
	}
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", harddisk=" + harddisk + "]";
	}
	

}
