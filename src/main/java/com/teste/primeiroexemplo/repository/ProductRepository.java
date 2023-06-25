package com.teste.primeiroexemplo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.teste.primeiroexemplo.model.Product;

@Repository
public class ProductRepository {
  private List<Product> product = new ArrayList<Product>();
  private Integer lastId = 0;

  public List<Product> GetAll() {
    return product;
  }

  public Optional<Product> GetById(Integer id) {
    return product.stream().filter(product -> product.getId() == id).findFirst();
  }

  public Product AddProduct(Product model) {
    lastId++;
    model.setId(lastId);
    product.add(model);
    return model;
  }

  public void RemoveProduct(Integer id) {
    product.removeIf(product -> product.getId() == id);
  }

  public Optional<Product> Update(Product model) {
    Optional<Product> product = GetById(model.getId());

    product.ifPresent(p -> {
      p.setName(model.getName());
      p.setObservation(model.getObservation());
      p.setQuantity(model.getQuantity());
      p.setValues(model.getValues());
    });
    return product;

  }
}
