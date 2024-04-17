package com.brite.springboot.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/product")
public class ProductController {



    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/productmessage")
    public @ResponseBody String productmessage() {
        ProductUserWebClient producuserwebclient = new ProductUserWebClient();
        producuserwebclient.getproductUserData();
        return "Product Messages";
    }

    @PostMapping(path = "/addproduct")
    public @ResponseBody Product addproduct(@RequestBody Product product) {
        return productService.addproduct(product);
    }

    @GetMapping(path = "/productId/{productId}")
    public @ResponseBody Product findById(@PathVariable String productId) {
        return productService.findById(productId);
    }


    @GetMapping(path = "/allproducts")
    public @ResponseBody Iterable<Product> getAllProducts() {
        return (Iterable<Product>) productService.findAll();
    }

}
