package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.service.EventPublisherService;

@Component
public class AutoStart {

	@Autowired
	private EventPublisherService pubService;

	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		pubService.performOperation();
		
		pubService.createPerson();
	}
}
