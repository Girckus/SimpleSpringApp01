package example.SimpleSpringCore.beans.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Fruit;

@Profile("orange")
@Component
public class Orange implements Fruit {

	@Override
	public String fuitInfo() {
		return "Orange";
	}

}
