package com.wood.factory;

public class ProviderImpl implements Provider {
	
	public ProviderImpl() {
	}

	public Service newService() {
		return FactoryPattern.getAHappyMan();
	}
}
