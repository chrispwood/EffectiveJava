package com.wood.factory;

public class FactoryPattern implements Service {

	// advantage:  your class is "instance controlled"
	private static FactoryPattern oldMan;
	private static FactoryPattern youngMan;
	private static FactoryPattern happyMan;
	private static FactoryPattern sadMan;

	static {
		oldMan = new FactoryPattern("Old man","old",80,"so-so");
		youngMan = new FactoryPattern("Young man","young",20,"disconnected");
		happyMan = new FactoryPattern("Happy man","middle",40,"happy");
		sadMan = new FactoryPattern("Sad man","middle",43,"sad");
	}

	// advantage: your constructors have names
	public static FactoryPattern getAnOldMan() { return oldMan; }
	public static FactoryPattern getAYoungMan() { return youngMan; }
	public static FactoryPattern getAHappyMan() { return happyMan; }
	public static FactoryPattern getASadMan() { return sadMan; }

	// advantage: your constructors can return subtypes
	public static FactoryPattern getSubPatternOne() { return new FactorySubPatternOne("subpattern one"); }
	public static FactoryPattern getSubPatternTwo() { return new FactorySubPatternTwo("subpattern two"); }

	public FactoryPattern() {}

	private String name;
	private String description;
	private int age;
	private String emotion;
	
	// to make sure no one can create this object
	private FactoryPattern(String name, String description, int age, String emotion) {
		this.name = name;
		this.description = description;
		this.age = age;
		this.emotion = emotion;
	}

	public String getName() { return name; }
	public String getDescription() { return description; }
	public int getAge() { return age; }
	public String getEmotion() { return emotion; }

	@Override
	public String toString() {
		return "The man's name is: " + getName() + ". His is described as " + getDescription() + 
			". He is " + getAge() + " years old and is currently " + getEmotion();
	}

	public static void main(String args[]) {
		System.out.println(FactoryPattern.getAnOldMan().toString());
		System.out.println(FactoryPattern.getAYoungMan().toString());
		System.out.println(FactoryPattern.getAHappyMan().toString());
		System.out.println(FactoryPattern.getASadMan().toString());

		System.out.println(FactoryPattern.getSubPatternOne().toString());
		System.out.println(FactoryPattern.getSubPatternTwo().toString());

		System.out.println("");

		Service service = Services.newInstance();
		System.out.println(service.getName());
		System.out.println(service.getAge());
		System.out.println(service.getDescription());
		System.out.println(service.getEmotion());

		System.out.println("");

		service = Services.newInstance("old");
		System.out.println(service.getName());
		System.out.println(service.getAge());
		System.out.println(service.getDescription());
		System.out.println(service.getEmotion());

		System.out.println("");

		service = Services.newInstance("young");
		System.out.println(service.getName());
		System.out.println(service.getAge());
		System.out.println(service.getDescription());
		System.out.println(service.getEmotion());


	}
}
