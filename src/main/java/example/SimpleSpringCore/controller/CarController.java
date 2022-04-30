package example.SimpleSpringCore.controller;

import org.springframework.stereotype.Controller;

import example.SimpleSpringCore.beans.Car;

@Controller("animalSound")
public class CarController {
	
	private Car car;
	
	public CarController(Car car) {
		this.car = car;
	}
	
	public String info() {
		return car.toString();
	}
	
}