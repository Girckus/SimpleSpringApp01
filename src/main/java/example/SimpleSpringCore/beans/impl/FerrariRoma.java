package example.SimpleSpringCore.beans.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Car;

@Primary
@Component
public class FerrariRoma implements Car {

	@Override
	public String brand() {
		return "Ferrari";
	}

	@Override
	public String model() {
		return "Roma";
	}

	@Override
	public String toString() {
		return "FerrariRoma [brand()=" + brand() + ", model()=" + model() + "]";
	}
	
}