package com.wood.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
	
	private Services() {}

	static {
		providers = new ConcurrentHashMap<String, Provider>();
		registerDefaultProvider(new ProviderImpl());
		registerProvider("old",new OldProviderImpl());
		registerProvider("young",new YoungProviderImpl());
	}

	private static final Map<String, Provider> providers;

	public static final String DEFAULT_PROVIDER_NAME = "<def>";

	public static void registerDefaultProvider(Provider p) {
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}
	public static void registerProvider(String name, Provider p) {
		providers.put(name, p);
	}

	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}
	public static Service newInstance(String name) {
		Provider p = providers.get(name);
		if(p==null)
			throw new IllegalArgumentException("No provider registered with name: " + name);
		return p.newService();
	}
}
