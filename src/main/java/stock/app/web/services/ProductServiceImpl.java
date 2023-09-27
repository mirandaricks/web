package stock.app.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock.app.web.models.Product;
import stock.app.web.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product insertProduct(Product product) {
    return productRepository.save(product);
  }

  @Override
  public Product updateProduct(Long id, Product product) {
    if(productRepository.existsById(id)){
      product.setId(id);
      return productRepository.save(product);
    }
    return null;
  }

  @Override
  public void deleteProduct(Long id) {
    productRepository.deleteById(id);
  }
  @Override
  public List<Product> findAllProduct() {
    return productRepository.findAll();
  }

  @Override
  public Product findByIdProduct(Long id) {
    return productRepository.findById(id).orElse(null);
  }

}
