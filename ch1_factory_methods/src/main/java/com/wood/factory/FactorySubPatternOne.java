package com.wood.factory;

public class FactorySubPatternOne extends FactoryPattern {

	private String newVarOne;
	
	public FactorySubPatternOne(String customValue) {
		newVarOne = customValue;
	}

	public String getSubVarOne() { return newVarOne; }

	@Override
	public String toString() {
		return "FactorySubPatternOne: " + newVarOne;
	}
}
