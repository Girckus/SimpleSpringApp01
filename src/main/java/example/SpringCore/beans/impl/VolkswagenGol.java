package example.SpringCore.beans.impl;

import org.springframework.stereotype.Component;

import example.SpringCore.beans.Car;

@Component
public class VolkswagenGol implements Car {

	@Override
	public String brand() {
		return "Volkswagen";
	}

	@Override
	public String model() {
		return "Gol";
	}

	@Override
	public String toString() {
		return "VolkswagenGol [brand()=" + brand() + ", model()=" + model() + "]";
	}
	
}