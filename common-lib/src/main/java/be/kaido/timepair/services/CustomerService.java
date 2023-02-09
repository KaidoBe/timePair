package be.kaido.timepair.services;

import be.kaido.timepair.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	private CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
