package com.ddlab.rnd.event;

import org.springframework.context.ApplicationEvent;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class DataEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	
	public DataEvent(Object source) {
		super(source);
	}
}
