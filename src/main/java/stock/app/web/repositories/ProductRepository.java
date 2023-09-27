package stock.app.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stock.app.web.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
