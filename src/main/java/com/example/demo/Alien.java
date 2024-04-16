package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//At the time you added the component it will make this as spring bean we can use it any were
public class Alien {
 private int id;
 private String name;
 private String tech;
 @Autowired
 private Laptop laptop;
 
 public Alien() {
	 super();
	 System.out.println("objected created");
 }
 
  
public Laptop getLaptop() {
	return laptop;
}


public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}

public void show() {
	System.out.println("in Show");
	laptop.compile();
}
 
}
