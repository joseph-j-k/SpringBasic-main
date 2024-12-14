package com.srg.spring.basics.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class Addition implements CalculationService {

	@Override
	public String compute() {
		// TODO Auto-generated method stub
		return "Add";
	}

}
