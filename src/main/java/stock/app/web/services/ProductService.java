package stock.app.web.services;

import java.util.List;

import stock.app.web.models.Product;

public interface ProductService {
  Product insertProduct(Product product);
  Product updateProduct(Long id , Product product);
  void deleteProduct(Long id);
  List<Product> findAllProduct();
  Product findByIdProduct(Long id);

}
