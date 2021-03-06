package co.com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.store.entity.Customer;
import co.com.store.entity.Region;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	public Customer findByNumberID(String numberID);

	public List<Customer> findByLastName(String lastName);

	public List<Customer> findByRegion(Region region);
}
