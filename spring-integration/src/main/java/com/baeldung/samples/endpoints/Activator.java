package com.nklkarthi.samples.endpoints;

public interface Activator<T> {
	
	public void handleMessage(T input);

}
