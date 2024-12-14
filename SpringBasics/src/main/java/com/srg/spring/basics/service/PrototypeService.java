package com.srg.spring.basics.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeService {

  private String dateTime = LocalDateTime.now().toString();

  public String getMethod(){
    return dateTime;
  }
}