package example.SimpleSpringCore.beans.impl;

import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Car;

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
		return "FerrariRoma [brand()=" + brand() + ", model()=" + model() + "]";
	}
	
}