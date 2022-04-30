package example.SimpleSpringCore.beans.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Fruit;

@Profile({"lemon", "default"})
@Component
public class Lemon implements Fruit {

	@Override
	public String fuitInfo() {
		return "Lemon";
	}
	
}
