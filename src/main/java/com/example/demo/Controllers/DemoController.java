package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

  @RestController
  public class DemoController {
    
    @PostMapping("/product")
    public String createProduct(@RequestBody final Product product) {
        System.err.println(product);
        return product.getId();
    }

}