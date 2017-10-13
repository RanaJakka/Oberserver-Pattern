package com.observable.pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Central_stub implements Observable {
	
	private ArrayList<Observer> list_observer=new ArrayList<>();
	
	private Person obj_per=new  Person("Rana","JAKKA");
	


	public void Update()
	{
		obj_per.setFalg(true);
		
		obj_per.setfName("RAMANA");
		this.notifyUsers();
	}
	
	
	@Override
	public boolean subScribe(Observer ob) {
		// TODO Auto-generated method stub
		
		if(ob==null)
			throw new NullPointerException("Observer should not null");
		else if(!list_observer.contains(ob))
		{
			list_observer.add(ob);
			return true;
			
			
		}else
				
		return false;
	}


	@Override
	public void notifyUsers() {
		// TODO Auto-generated method stub
		
		Iterator<Observer> noti_fyobj=list_observer.iterator();
		
while(noti_fyobj.hasNext())
{
	Observer o=noti_fyobj.next();
	o.update(obj_per.getfName());
}
	
		
	}


	@Override
	public boolean unsubScrib(Observer ob) {		
		// TODO Auto-generated method stub
		
		if(ob==null)
			throw new NullPointerException("Observer should not null");
		else if(list_observer.contains(ob))
		{
			
			list_observer.remove(ob);
			
			return true;
			
		}else
				
		return false;
	}





}
