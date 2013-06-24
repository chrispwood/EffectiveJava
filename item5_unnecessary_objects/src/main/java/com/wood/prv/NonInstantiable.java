package com.wood.prv;

public class NonInstantiable {
	
	// you cannot instantiate this class
	private NonInstantiable() {
		// this is to make sure some developer doesn't accidentally instantiate the instance
		throw new AssertionError();
	}

	public static String factoryMethod() {
		return "instantiated object";
	}

	public static NonInstantiable getInstance() {
		// I shouldn't be allowed to do this!
		return new NonInstantiable();
	}

	public static void main(String args[]) {
		System.out.println(NonInstantiable.factoryMethod());

		try { NonInstantiable ni = new NonInstantiable(); } 
		catch(AssertionError e) { System.out.println("not allowed to instantiate this!"); }

		try { NonInstantiable ni = NonInstantiable.getInstance(); } 
		catch(AssertionError e) { System.out.println("Even class members cannot instantiate a member"); }
	}
}
