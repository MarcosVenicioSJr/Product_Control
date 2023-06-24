package com.teste.primeiroexemplo.model;

public class Product {
  private Integer id;

  private String name;

  private Integer quantity;

  private Double values;

  private String observation;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getValues() {
    return values;
  }

  public void setValues(Double values) {
    this.values = values;
  }

  public String getObservation() {
    return observation;
  }

  public void setObservation(String observation) {
    this.observation = observation;
  }
  
}
