package example.SpringCore.controller;

import org.springframework.stereotype.Controller;

import example.SpringCore.beans.Fruit;

@Controller
public class FruitController {
	
	private Fruit fruit;
	
	//@Autowired no need annotation
	public FruitController(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public String info() {
		return fruit.fuitInfo();
	}
	
}