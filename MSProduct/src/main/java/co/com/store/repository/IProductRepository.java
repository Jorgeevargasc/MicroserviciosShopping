package co.com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.store.entity.Category;
import co.com.store.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{
	
	public List<Product> findByCategory(Category category);

}
