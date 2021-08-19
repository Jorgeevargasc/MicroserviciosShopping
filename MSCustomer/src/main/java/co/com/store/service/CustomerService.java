package co.com.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.store.entity.Customer;
import co.com.store.entity.Region;
import co.com.store.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerService implements ICustomerService{

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findCustomerAll() {
		return customerRepository.findAll();
	}

	@Override
	public List<Customer> findCustomersByRegion(Region region) {
		return customerRepository.findByRegion(region);
	}

	@Override
	public Customer createCustomer(Customer customer) {

		Customer customerDB = customerRepository.findByNumberID(customer.getNumberID());
		if (customerDB != null) {
			return customerDB;
		}

		customer.setState("CREATED");
		customerDB = customerRepository.save(customer);
		return customerDB;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer customerDB = getCustomer(customer.getId());
		if (customerDB == null) {
			return null;
		}
		customerDB.setFirstName(customer.getFirstName());
		customerDB.setLastName(customer.getLastName());
		customerDB.setEmail(customer.getEmail());
		customerDB.setPhotoUrl(customer.getPhotoUrl());

		return customerRepository.save(customerDB);
	}

	@Override
	public Customer deleteCustomer(Customer customer) {
		Customer customerDB = getCustomer(customer.getId());
		if (customerDB == null) {
			return null;
		}
		customer.setState("DELETED");
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomer(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

}
