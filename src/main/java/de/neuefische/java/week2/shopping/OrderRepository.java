package de.neuefische.java.week2.shopping;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OrderRepository {

    private final Map<String, Order> orders = new HashMap<>();

    public Collection<Order> list() {
        return Collections.unmodifiableCollection(orders.values());
    }

    public Optional<Order> get(String id) {
        return Optional.ofNullable(orders.get(id));
    }

    public void add(Order order) {
        orders.put(order.id(), order);
    }
}
