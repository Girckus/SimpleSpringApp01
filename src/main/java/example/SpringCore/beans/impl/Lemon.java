package example.SpringCore.beans.impl;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.stereotype.Component;

import example.SpringCore.beans.Fruit;

@Profile({"lemon", "default"})
@Component
public class Lemon implements Fruit, EnvironmentAware, MessageSourceAware, NotificationPublisherAware {

	@Override
	public String fuitInfo() {
		return "Lemon";
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("EnvironmentAware - Lemon Class - " + environment.toString());
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("MessageSourceAware - Lemon Class - " + messageSource.toString());
	}

	@Override
	public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
		System.out.println("NotificationPublisherAware - Lemon Class - " + notificationPublisher.toString());
	}
	
}