package com.fluxo_inventario.product.dto;

import java.math.BigDecimal;

public record ProductResponseDTO(

        String name,

        String description,

        BigDecimal price,

        Integer quantity

) {
}