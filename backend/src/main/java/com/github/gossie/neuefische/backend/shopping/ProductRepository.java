package com.github.gossie.neuefische.backend.shopping;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final Map<String, Product> products = new HashMap<>() {
        {
            put("4711", new Product("4711", "Produkt 1"));
            put("4712", new Product("4712", "Produkt 2"));
            put("4713", new Product("4713", "Produkt 3"));
            put("4714", new Product("4714", "Produkt 4"));
            put("4715", new Product("4715", "Produkt 5"));
        }
    };

    public Collection<Product> list() {
        return Collections.unmodifiableCollection(products.values());
    }

    public Optional<Product> get(String id) {
        return Optional.ofNullable(products.get(id));
    }

}
