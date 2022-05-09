package example.SimpleSpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.SimpleSpringCore.beans.Car;
import example.SimpleSpringCore.beans.impl.FerrariRoma;

@Configuration
public class SimpleSpringCoreConfiguration {

	@Bean(name="theferrari", initMethod = "init")
	public Car getFerrari() {
		return new FerrariRoma();
	}

}