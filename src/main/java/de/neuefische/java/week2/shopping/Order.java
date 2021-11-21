package de.neuefische.java.week2.shopping;

import java.util.List;

public record Order(String id, List<Product> products) {
}
