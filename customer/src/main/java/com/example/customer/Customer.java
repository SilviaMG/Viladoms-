package com.example.customer;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Customer {
	
@Id
	
	public String id;
	
	public String firstName;
	public String lastName;
	
	public Customer() {}
	
	public Customer(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override 
	public String toString() {
		return String.format( 
				"Customer[id%s, firstName%s, lastName%s]",
				id, firstName, lastName);
	}
		
}
