package com.ddlab.rnd.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.model.Person;

@Order(2)
@Service
public class AadharValidation implements Validator {

	@Override
	public void validate(Person person) {
		System.out.println("Validating person addhar no: "+person.getAadharNo());
	}
}
