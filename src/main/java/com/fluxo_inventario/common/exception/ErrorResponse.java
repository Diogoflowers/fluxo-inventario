package com.fluxo_inventario.common.exception;

import java.util.List;

public record ErrorResponse(
        Integer status,
        String message,
        List<String> errors
) {
}