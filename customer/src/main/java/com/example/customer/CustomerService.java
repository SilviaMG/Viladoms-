package com.example.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerrepository;
	
	public Iterable<Customer> findAll()  {
	 
		return customerrepository.findAll(); 
	}
	
		
	

public Customer save (Customer customer) {
	customerrepository.save(customer); 
	
	return customer;
	
	}

public String findAnddeleteById (String id) {
	String response = "Customer deleted";

	
	Optional<Customer> customerFound = customerrepository.findById(id);
	
	if (customerFound.isPresent()) {
	
		//customerFound.get()
		
			customerrepository.delete(customerFound.get());
			response += "customer deleted";
		
	} else {
	
		response += "customer not found";
	
	}

	return response;
}
}

