package tech.miqueias.bento.io.pedido.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record ProdutoItemRequestDto(
        @NotNull
        Long pratoId,

        @NotNull
        @DecimalMin(value = "0.0001")
        @DecimalMax("1.0")
        BigDecimal divisao
) {}
