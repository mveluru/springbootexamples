package com.brite.springboot.product;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



@Component
public class ProductRepository {


   private static Map<String, Product> productrepo = LoadProductData.loadproddata();

    protected Product addproduct(Product product) {

        productrepo.put(product.getProductId(), product);
        return productrepo.get(product.getProductId());
    }

    protected Product findById(String productid) {
        return productrepo.get(productid);
    }

    protected List<Product> findAll(){
      return productrepo.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
    }

}
