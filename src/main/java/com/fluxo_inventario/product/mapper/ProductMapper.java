package com.fluxo_inventario.product.mapper;

import com.fluxo_inventario.product.dto.ProductRequestDTO;
import com.fluxo_inventario.product.dto.ProductResponseDTO;
import com.fluxo_inventario.product.entity.Product;

public class ProductMapper {

    public static Product toEntity(ProductRequestDTO dto) {

        Product product = new Product();

        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setPrice(dto.price());
        product.setQuantity(dto.quantity());

        return product;
    }

    public static ProductResponseDTO toResponseDTO(Product product) {

        return new ProductResponseDTO(
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getQuantity()
        );
    }
}