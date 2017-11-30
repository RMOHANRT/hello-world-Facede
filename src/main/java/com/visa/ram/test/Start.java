package com.visa.ram.test;

public class Start implements Car{

	public void start() {
	PowerIgnition pi = new PowerIgnition();
	pi.startPowerIgnition();
	Fuel f = new Fuel();
	f.startFuelFlow();

	}
	}