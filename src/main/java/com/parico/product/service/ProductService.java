package com.parico.product.service;

import com.parico.product.domain.Product;
import com.parico.product.model.ProductRequest;
import com.parico.product.model.ProductResponse;
import com.parico.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public void create(ProductRequest productRequest)
    {
        Product newProduct = productMappper(productRequest);
        productRepository.save(newProduct);
    }

    private Product productMappper(ProductRequest productRequest)
    {
        Product product = new Product();

        product.setProductID(productRequest.getProductID());
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        product.setCurrency(productRequest.getCurrency());

        return product;
    }

    public ProductResponse get(String id)
    {
       Product product = productRepository.findByProductID(id);
       return productResponseMappper(product);
    }

    private ProductResponse productResponseMappper(Product product)
    {
        ProductResponse response  = new ProductResponse();

        response.setProductID(product.getProductID());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setPrice(product.getPrice());
        response.setCurrency(product.getCurrency());

        return response;
    }

    public void update(ProductRequest productRequest)
    {
        Product updateProduct = productMappper(productRequest);
        productRepository.save(updateProduct);
    }

    public void delete(String id)
    {
        productRepository.deleteById(id);
    }
}