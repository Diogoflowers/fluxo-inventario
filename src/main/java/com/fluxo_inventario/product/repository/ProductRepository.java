package com.fluxo_inventario.product.repository;

import com.fluxo_inventario.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}