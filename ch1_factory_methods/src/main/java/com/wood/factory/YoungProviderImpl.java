package com.wood.factory;

public class YoungProviderImpl implements Provider {
	
	public YoungProviderImpl() {

	}

	public Service newService() {
		return FactoryPattern.getAYoungMan();
	}
}
