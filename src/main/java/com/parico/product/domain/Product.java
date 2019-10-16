package com.parico.product.domain;

import javax.persistence.*;
import javax.validation.Constraint;

@Table(name = "product")
@Entity
public class Product
{
    @Id
    @Column(name="product_id")
    private String productID;
    @Column(name="name")
    private String name ;
    @Column(name="price")
    private Double price;
    @Column(name="description")
    private String description;
    @Column(name="currency")
    private String currency;


    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
