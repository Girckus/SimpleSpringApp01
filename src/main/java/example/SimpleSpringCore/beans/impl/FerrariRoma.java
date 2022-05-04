package example.SimpleSpringCore.beans.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import example.SimpleSpringCore.beans.Car;

@Primary
@Component
public class FerrariRoma implements Car, InitializingBean, DisposableBean {

	@Override
	public String brand() {
		return "Ferrari";
	}

	@Override
	public String model() {
		return "Roma";
	}
	
	public FerrariRoma() {
		System.out.println("FerrariRoma - Constructor");
	}

	@Override
	public String toString() {
		return "FerrariRoma [brand()=" + brand() + ", model()=" + model() + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean - FerrariRoma destoyed");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean - FerrariRoma properties set");
	}
	
	@PostConstruct
    public void postConstruct(){
        System.out.println("FerrariRoma Class - The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("FerrariRoma Class - The Predestroy annotated method has been called");
    }
	
    public void beforeInit(){
        System.out.println("FerrariRoma Class - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("FerrariRoma Class - After init called by Bean Post Processor");
    }
    
    public void init() {
        System.out.println("FerrariRoma Class - Custom init method");
    }
}