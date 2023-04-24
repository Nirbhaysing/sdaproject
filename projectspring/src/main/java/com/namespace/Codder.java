package com.namespace;

public class Codder {

	private int id;
	private String name;
	private  String qualification;
	private String dob;
	public Codder(int id, String name, String qualification, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.dob = dob;
	}
	public Codder() {
		super();
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Codder [id=" + id + ", name=" + name + ", qualification=" + qualification + ", dob=" + dob + "]";
	}
	
	
	
}
