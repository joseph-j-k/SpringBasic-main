package com.srg.spring.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentService {

	public String  getComponentMessage() {
		return "Hello From Component";
	}
	
}
