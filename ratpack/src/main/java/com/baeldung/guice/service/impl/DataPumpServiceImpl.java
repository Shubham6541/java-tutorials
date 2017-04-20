package com.nklkarthi.guice.service.impl;

import java.util.UUID;

import com.nklkarthi.guice.service.DataPumpService;

public class DataPumpServiceImpl implements DataPumpService {

	@Override
	public String generate() {
		return UUID.randomUUID().toString();
	}

}
