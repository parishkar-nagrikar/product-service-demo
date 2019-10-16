package com.parico.product.controller;

import com.parico.product.model.ProductRequest;
import com.parico.product.model.ProductResponse;
import com.parico.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
    private ProductService productService ;

    @PostMapping
    //@RequestMapping("/create")
    public ResponseEntity<String> create(@RequestBody ProductRequest productRequest)
    {
        productService.create(productRequest);
        return ResponseEntity.ok("Product is successfully added!");
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> get(@PathVariable String id)
    {
        return ResponseEntity.ok(productService.get(id));
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody ProductRequest productRequest)
    {
        productService.update(productRequest);
        return ResponseEntity.ok("Product is successfully Updated!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id)
    {
        productService.delete(id);
        return ResponseEntity.ok("Product is successfully Deleted!");
    }
}