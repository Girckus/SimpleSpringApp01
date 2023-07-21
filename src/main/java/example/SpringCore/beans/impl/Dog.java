package example.SpringCore.beans.impl;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

import example.SpringCore.beans.Animal;

@Component
public class Dog implements Animal, EmbeddedValueResolverAware, ImportAware, LoadTimeWeaverAware {

	@Override
	public String makeSound() {
		return "Au Au";
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		System.out.println("EmbeddedValueResolverAware - Dog Class - " + resolver.toString());
	}

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		System.out.println("ImportAware - Dog Class - " + importMetadata.toString());
	}

	@Override
	public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
		System.out.println("LoadTimeWeaver - Dog Class - " + loadTimeWeaver.toString());
	}
	
}