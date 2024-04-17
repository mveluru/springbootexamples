package com.brite.springboot.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    protected Product addproduct(Product product) {
       return productRepository.addproduct(product);

    }

    protected Product findById(String productid) {
        return productRepository.findById(productid);
    }

    protected Iterable<Product> findAll(){
        return productRepository.findAll();
    }



}
