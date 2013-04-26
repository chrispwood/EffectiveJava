package com.wood.factory;

public class FactorySubPatternTwo extends FactoryPattern {

	private String subVarTwo;
	
	public FactorySubPatternTwo(String customValue) {
		subVarTwo = customValue;
	}

	public String getSubVarTwo() { return subVarTwo; }

	@Override
	public String toString() { 
		return "FactorySubPatternTwo: " + subVarTwo;
	}
}
