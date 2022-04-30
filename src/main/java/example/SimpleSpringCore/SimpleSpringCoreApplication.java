package example.SimpleSpringCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import example.SimpleSpringCore.controller.AnimalController;
import example.SimpleSpringCore.controller.CarController;
import example.SimpleSpringCore.controller.FruitController;

@SpringBootApplication
public class SimpleSpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SimpleSpringCoreApplication.class, args);
	
		AnimalController animalSound = (AnimalController) appContext.getBean("animalSound");
		
		System.out.println(animalSound.sound());
		
		FruitController fruitController = (FruitController) appContext.getBean("fruitController");
		
		System.out.println(fruitController.info());
		
		CarController carController = (CarController) appContext.getBean("carController");
		
		System.out.println(carController.info());
	}

}
