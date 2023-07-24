package example.SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

import example.SpringCore.beans.Car;
import example.SpringCore.beans.impl.FerrariRoma;
import example.SpringCore.converter.EmployeeConverter;
import example.SpringCore.converter.GenericBigDecimalConverter;
import example.SpringCore.converter.StringEnumConverter;

@Configuration
public class SpringCoreConfiguration {

	@Bean(name="theferrari", initMethod = "init")
	public Car getFerrari() {
		return new FerrariRoma();
	}
	
	@Bean
	public ConversionService conversionService() {
	    DefaultConversionService service = new DefaultConversionService();
	    service.addConverter(new EmployeeConverter());
	    service.addConverterFactory(new StringEnumConverter());
	    service.addConverter(new GenericBigDecimalConverter());
	    return service;
	}
	
}