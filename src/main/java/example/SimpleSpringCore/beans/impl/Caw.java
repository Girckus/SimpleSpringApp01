package example.SimpleSpringCore.beans.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Animal;

@Component
public class Caw implements Animal, BeanClassLoaderAware, BeanFactoryAware, BeanNameAware {

	@Override
	public String makeSound() {
		return "Muu";
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("BeanClassLoaderAware - Caw Class - " + classLoader.getName());
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware - Caw Class - " + beanFactory.toString());
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware - Caw Class - " + name);
	}

	
}