package example.SpringCore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import example.SpringCore.beans.Animal;

@Controller("animalSound")
public class AnimalController {
	
	@Qualifier("cat")
	@Autowired
	private Animal animal1;
	
	private Animal animal2;
	
	private Animal animal3;
	
	public AnimalController(@Qualifier("dog") Animal animal) {
		this.animal2 = animal;
	}
	
	@Qualifier("caw")
	@Autowired
	public void setAnimal(Animal animal) {
		this.animal3 = animal;
	}
	
	public String sound() {
		return animal1.makeSound() + " - " + animal2.makeSound() + " - " + animal3.makeSound();
	}
	
}