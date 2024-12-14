package com.srg.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.jeasy.random.EasyRandom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srg.springboot.model.Person;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MVCController {
	
	@RequestMapping("/mvc")
	@ResponseBody
	public String helloWorld() {
		log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
		return "Hello World";
	}
	
	
	
	

}
