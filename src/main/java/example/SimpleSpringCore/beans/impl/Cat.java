package example.SimpleSpringCore.beans.impl;

import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Animal;

@Component
public class Cat implements Animal {

	@Override
	public String makeSound() {
		return "Miau";
	}
	
}