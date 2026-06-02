package com.fluxo_inventario.product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRequestDTO(

        @NotBlank(message = "Product name is required")
        String name,

        @NotBlank(message = "Product description is required")
        String description,

        @Positive(message = "Price must be greater than zero")
        BigDecimal price,

        @PositiveOrZero(message = "Quantity cannot be negative")
        Integer quantity

) {
}