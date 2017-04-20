package com.nklkarthi.guice.config;

import com.nklkarthi.guice.service.DataPumpService;
import com.nklkarthi.guice.service.impl.DataPumpServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class DependencyModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DataPumpService.class).to(DataPumpServiceImpl.class)
		  .in(Scopes.SINGLETON);
	}

}
