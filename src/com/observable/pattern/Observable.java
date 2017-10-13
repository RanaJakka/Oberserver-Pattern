package com.observable.pattern;

public interface Observable {
	
	boolean subScribe(Observer ob);
	boolean unsubScrib(Observer ob);
	public void notifyUsers();

}
