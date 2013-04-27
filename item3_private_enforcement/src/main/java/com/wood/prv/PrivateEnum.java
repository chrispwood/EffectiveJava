package com.wood.prv;

public enum PrivateEnum {
	INSTANCE;

	public void doThings() { 
		System.out.println("I am doing things as an enum");
	}
}
