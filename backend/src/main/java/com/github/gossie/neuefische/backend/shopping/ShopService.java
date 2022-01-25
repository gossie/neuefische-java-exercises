package com.github.gossie.neuefische.backend.shopping;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ShopService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public ShopService(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public Optional<Product> getProduct(String id) {
        return productRepository.get(id);
    }

    public Collection<Product> listProducts() {
        return productRepository.list();
    }

    public void addOrder(Order order) {
        orderRepository.add(order);
    }

    public Optional<Order> getOrder(String id) {
        return orderRepository.get(id);
    }

    public Collection<Order> listOrders() {
        return orderRepository.list();
    }
}
