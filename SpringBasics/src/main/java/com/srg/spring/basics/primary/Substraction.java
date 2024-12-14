package com.srg.spring.basics.primary;

import org.springframework.stereotype.Service;

@Service
public class Substraction implements CalculationService {

	/**
	 * this is 
	 */
	
	@Override
	public String compute() {
		return "substract";
	}

}
