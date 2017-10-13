package com.observable.pattern;

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Central_stub cen_stb=new Central_stub();
		cen_stb.subScribe(new UserInfo("Rana"));
		cen_stb.subScribe(new UserInfo("Prathap"));
		cen_stb.subScribe(new UserInfo("Jakka"));

		System.out.println("ad");
		cen_stb.Update();
		
	}

}
