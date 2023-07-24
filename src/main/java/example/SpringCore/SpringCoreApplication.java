package example.SpringCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import example.SpringCore.beans.impl.SpELDemo;
import example.SpringCore.controller.AnimalController;
import example.SpringCore.controller.CarController;
import example.SpringCore.controller.FruitController;
import example.SpringCore.service.BigDecimalService;
import example.SpringCore.service.ClientService;
import example.SpringCore.service.EmployeeService;
import example.SpringCore.service.GradeService;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringCoreApplication.class, args);
	
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
		
		EmployeeService employeeService = (EmployeeService) appContext.getBean("employeeService");
		System.out.println(employeeService.getEmployee("1,50000.00"));
		
		GradeService gradeService = (GradeService) appContext.getBean("gradeService");
		System.out.println(gradeService.getGrade("OK"));
		
		BigDecimalService bigDecimalService = (BigDecimalService) appContext.getBean("bigDecimalService");
		System.out.println(bigDecimalService.getBigDecimal(Integer.valueOf(11)));
		System.out.println(bigDecimalService.getBigDecimal(Double.valueOf(25.23)));
		System.out.println(bigDecimalService.getBigDecimal("2.32"));
		
		SpELDemo spel = (SpELDemo) appContext.getBean("spELDemo");
		System.out.println(spel);
	}

}