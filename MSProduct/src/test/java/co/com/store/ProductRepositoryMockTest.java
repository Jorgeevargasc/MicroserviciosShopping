package co.com.store;

import java.util.Date;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import co.com.store.entity.Category;
import co.com.store.entity.Product;
import co.com.store.repository.IProductRepository;

@DataJpaTest
public class ProductRepositoryMockTest {
	
	@Autowired
	private IProductRepository iProductRepository;
	
	public void whenFindByCategory_thenReturnListProduct() {
		Product product01 = Product.builder().name("computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1240.99"))
                .status("Created")
                .createAt(new Date()).build();
        iProductRepository.save(product01);
        
        List<Product> founds = iProductRepository.findByCategory(product01.getCategory());

        Assertions.assertThat(founds.size()).isEqualTo(3);

	}

}
