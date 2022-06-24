package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.event.DataEvent;
import com.ddlab.rnd.event.PersonEvent;

@Service
public class EventPublisherService {
	
	@Autowired
    private ApplicationEventPublisher publisher;
	
	public void performOperation() {
		DataEvent dataEvent = new DataEvent(this);
		dataEvent.setId(123);
		dataEvent.setName("John Abraham");
		
		publisher.publishEvent(dataEvent);
	}
	
	public void createPerson() {
		PersonEvent pe = new PersonEvent();
		pe.setName("Ramana Maharshi");
		
		publisher.publishEvent(pe);
	}
}
