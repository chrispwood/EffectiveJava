package com.wood.factory;

public class OldProviderImpl implements Provider {
	
	public OldProviderImpl() {

	}

	public Service newService() {
		return FactoryPattern.getAnOldMan();
	}
}
