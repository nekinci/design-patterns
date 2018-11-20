package com;

public class SingletonDeseni {
	int x;
	private static SingletonDeseni nesne=new SingletonDeseni();
	private SingletonDeseni(){
		
	}
	public static SingletonDeseni getNesne() {
		return nesne;
	}
}
