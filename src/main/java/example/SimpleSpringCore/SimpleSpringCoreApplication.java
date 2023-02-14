package example.SimpleSpringCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import example.SimpleSpringCore.controller.AnimalController;
import example.SimpleSpringCore.controller.CarController;
import example.SimpleSpringCore.controller.FruitController;
import example.SimpleSpringCore.service.ClientService;

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
		
		ClientService client1 = (ClientService) appContext.getBean("client");
		client1.processPayment(10);
		
		ClientService client2 = (ClientService) appContext.getBean("client");
		client2.processPayment(20);
	}

}