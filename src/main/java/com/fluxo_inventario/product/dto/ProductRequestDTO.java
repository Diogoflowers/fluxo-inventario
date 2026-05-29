package com.fluxo_inventario.product.dto;

import java.math.BigDecimal;

public record ProductRequestDTO(

        String name,

        String description,

        BigDecimal price,

        Integer quantity

) {
}