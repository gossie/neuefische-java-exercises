package com.github.gossie.neuefische.backend.shopping;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ShopService shopService;

    ProductController(ShopService shopService) {
        this.shopService = shopService;
    }
    
    @GetMapping
    public Collection<Product> getProducts() {
        return shopService.listProducts();
    }

}
