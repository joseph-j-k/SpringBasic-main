package com.srg.springboot.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.jeasy.random.EasyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.srg.springboot.model.Person;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ApplicationController {
	
	@Value("${my.message}")
	private String myMessage;
	
	@Value("${my.listValue}")
	List<String> list;
	
	@Value("${my.mapValues}")
	private String map;
	
	@Value("static message")
	private String staticMessage;
	
	@Autowired
	DbSettings dbSettings;
	
	@GetMapping("/value")
	private String GetValue() {
		return "Value annotation demo-"+myMessage+list+map+staticMessage;
	}
	
	@GetMapping("/valuebean")
	private String GetValuebean() {
		return "Value annotation bean demo-"+dbSettings.getHost()+dbSettings.getPort()+dbSettings.getConnections()+""+dbSettings.getDefaultRecipients();
	}
	
	@RequestMapping("/login")
	public String getmapping() {
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
		return "Hello Wrold";
	}
	
	@RequestMapping("/list")
	public List<Person> getList(){
		EasyRandom generator=new EasyRandom();
		List<Person> persons = generator.objects(Person.class, 5)
		        .collect(Collectors.toList());
		
		return persons;
		
	}
	
	

}
