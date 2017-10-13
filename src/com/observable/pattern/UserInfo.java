package com.observable.pattern;

public class UserInfo implements Observer<Person>{
	
	private String nameOfObserver;
	
	public UserInfo(String st) {
		// TODO Auto-generated constructor stub
		
		nameOfObserver=st;
	}

	
	@Override
	public void update(String test) {
		
		System.out.print("New Updated for : "+nameOfObserver+" is "+test+"\n");
		
	}

}
