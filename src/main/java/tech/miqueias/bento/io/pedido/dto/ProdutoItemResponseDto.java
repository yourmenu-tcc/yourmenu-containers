package tech.miqueias.bento.io.pedido.dto;

import java.math.BigDecimal;

public record ProdutoItemResponseDto(
        Long pratoId,
        String nomePrato,
        BigDecimal divisao,
        BigDecimal precoUnitario
) {}
