package com.ddlab.rnd.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.event.DataEvent;
import com.ddlab.rnd.event.PersonEvent;

@Service
public class EventConsumerService {

	@EventListener
	public void consumeEvent(DataEvent data) {
		System.out.println("Received Event for processing: "+data);
	}
	
	@EventListener
	public void processPerson(PersonEvent pe) {
		System.out.println("Person for processing: "+pe);
	}
}
