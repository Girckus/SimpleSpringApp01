package example.SpringCore.beans.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationStartupAware;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.stereotype.Component;

import example.SpringCore.beans.Animal;

@Component
public class Cat implements Animal, ApplicationContextAware, ApplicationEventPublisherAware, ApplicationStartupAware {

	@Override
	public String makeSound() {
		return "Miau";
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Dog dog = (Dog) applicationContext.getBean("dog");
		System.out.println("ApplicationContextAware - Cat Class - " + dog.makeSound());
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("ApplicationEventPublisherAware - Cat Class - " + applicationEventPublisher.toString());
	}

	@Override
	public void setApplicationStartup(ApplicationStartup applicationStartup) {
		System.out.println("ApplicationStartupAware - Cat Class - " + applicationStartup.toString());
	}
	
}