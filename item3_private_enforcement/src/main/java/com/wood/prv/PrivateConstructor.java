package com.wood.prv;

public class PrivateConstructor {
	
	private static PrivateConstructor instance = new PrivateConstructor();
	private PrivateConstructor() {
		if(instance!=null) {
			throw new RuntimeException("Invalid attempt to create an instance of PrivateConstructor");
		}
	}

	public static PrivateConstructor getInstance() {
		return instance;
	}

	public void doThings() {
		System.out.println("I am doing things!");
	}

	public static void main(String args[]) {
		PrivateConstructor.getInstance().doThings();
		try {
			PrivateConstructor p = new PrivateConstructor();
		} catch(RuntimeException e) {
			System.out.println("I expected to catch this");
		}

		PrivateEnum instance = PrivateEnum.INSTANCE;
		instance.doThings();
	}
}
