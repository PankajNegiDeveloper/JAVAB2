package com.forgemycode.beans;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
public class Vehicle {
	
	private String name;

	public Vehicle() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    @PostConstruct
    public void initialize() {
        this.name = "Honda";
    }
    @PreDestroy
    public void destroy() {
    	System.out.println("Object destroyed");
    }

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	
	public void printHello(){
        System.out.println(
            "Printing Hello from Component Vehicle Bean");
    }


}
