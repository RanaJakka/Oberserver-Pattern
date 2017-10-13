package com.observable.pattern;

public class Person {
	
	private String fName;
	private String lName;
	private boolean falg;
	
	public Person(String fn,String ln) {
		// TODO Auto-generated constructor stub
		
		this.fName=fn;
		this.lName=ln;
		this.setFalg(false);
		
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public boolean isFalg() {
		return falg;
	}

	public void setFalg(boolean falg) {
		this.falg = falg;
	}
	
	
	
}
