package com.teste.primeiroexemplo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiroexemplo.model.Product;
import com.teste.primeiroexemplo.repository.ProductRepository;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAllProducts() {
    return productRepository.getAllProducts();
  }

  public Optional<Product> getById(Integer id) {
    return productRepository.getById(id);
  }

  public Product addProduct(Product model) {
    return productRepository.addProduct(model);
  }

  public void removeProduct(Integer id) {
    productRepository.removeProduct(id);
  }

  public Optional<Product> update(Integer id, Product model) {
    return productRepository.update(id, model);
  }
}
