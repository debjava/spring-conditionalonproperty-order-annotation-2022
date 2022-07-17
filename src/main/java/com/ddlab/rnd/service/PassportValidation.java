package com.ddlab.rnd.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.model.Person;

@Order(1)
@Service
public class PassportValidation implements Validator {

	@Override
	public void validate(Person person) {
		System.out.println("Validating person passport no: "+person.getPassportNo());
	}
}
