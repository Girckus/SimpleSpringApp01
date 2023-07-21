package example.SpringCore.beans.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import example.SpringCore.beans.Fruit;

@Profile("orange")
@Component
public class Orange implements Fruit {

	@Override
	public String fuitInfo() {
		return "Orange";
	}

}
