package com.github.gossie.neuefische.backend.shopping;

import java.util.List;

public record Order(String id, List<Product> products) {
}
