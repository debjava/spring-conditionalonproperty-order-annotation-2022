package com.ddlab.rnd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.model.Person;
import com.ddlab.rnd.service.Validator;

@Component
public class AutoRun {
	
	@Autowired
	private List<Validator> validators;
	
	@EventListener(ApplicationReadyEvent.class)
	public void onStartUp() {
		System.out.println("I am ready to run now...");
		Person p = new Person();
		p.setAadharNo("AA-12345");
		p.setPanNo("PA-12789-QRS");
		p.setPassportNo("PP-IND-34567");
		for(Validator validator : validators)
			validator.validate(p);
	}
}
