package com.parico.product.repository;

import com.parico.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product,String>
{
    Product findByProductID(String id);
}