package com.SetterObject;

public class Harddisk {
	private String type;

	public Harddisk() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Harddisk [type=" + type + "]";
	}
	

}
