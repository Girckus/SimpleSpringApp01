package example.SimpleSpringCore.beans.impl;

import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Animal;

@Component
public class Caw implements Animal {

	@Override
	public String makeSound() {
		return "Muu";
	}

}