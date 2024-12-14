package com.srg.spring.basics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srg.spring.basics.ConfigurationDemoBean;
import com.srg.spring.basics.primary.CalculationService;
import com.srg.spring.basics.service.HelloWorldService;
import com.srg.spring.component.ComponentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloWorldController {
	
	@Value("${hello.world.message:No message found in property file}")
	String message;
	
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@Autowired
	private ComponentService componentService;
	
	@Autowired
	private ConfigurationDemoBean configurationDemoBean;
	
	@Autowired
	@Qualifier("getSubstraction") 
	/**
	 * Among Qualifier and primary annotation Qualifier has precedence  
	 * so output will be substract here. 
	 */
	private CalculationService calculationService;
	
	@GetMapping("get")
	public String  getHelloWorld() {
		int a=4;
		log.trace("debugging logging value {}",a);
		log.debug("debugging logging value {}",a);
		log.info("info logging value {}",a);
		log.warn("warn logging value {}",a);
		log.error("error logging value {}",a);
		
		
		log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");	
        
        
	log.info(helloWorldService.getHelloWorld()+ message +"\r\n - :Component: - \r\n"+ 
			componentService.getComponentMessage()+"\r\n - :Congiguration: - \r\n"+
			 configurationDemoBean.sayHello());	
	
	
	 return helloWorldService.getHelloWorld()+message+"\r\n - :Component: - \r\n"+ 
	 componentService.getComponentMessage()+"\r\n - :Congiguration: - \r\n"+
	 configurationDemoBean.sayHello();
	 
	}
	
	@GetMapping("primary")
	public String  getGetPrimary() {
		return calculationService.compute();
	}
	
//	http://localhost:8085/actuator/beans

}
