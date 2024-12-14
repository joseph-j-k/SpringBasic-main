package com.srg.springboot.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Person  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7730122628770988342L;
	
	private String name;
	private int age;
	private String email;
	private boolean gender;

}
