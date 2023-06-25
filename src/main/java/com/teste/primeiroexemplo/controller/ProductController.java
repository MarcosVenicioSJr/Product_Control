package com.teste.primeiroexemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teste.primeiroexemplo.model.Product;
import com.teste.primeiroexemplo.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/{id}")
  public Optional<Product> GetById(@PathVariable Integer id) {
    return productService.getById(id);
  }

  @PostMapping
  public Product createProduct(@RequestBody Product model) {
    return productService.addProduct(model);
  }

  @DeleteMapping("/{id}")
  public void Delete(@PathVariable Integer id) {
    productService.removeProduct(id);
  }

  @PutMapping("/{id}")
  public Optional<Product> Update(@PathVariable Integer id, @RequestBody Product model) {
    return productService.update(id, model);
  }
}
