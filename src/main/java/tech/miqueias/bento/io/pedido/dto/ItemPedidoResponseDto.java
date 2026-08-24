package tech.miqueias.bento.io.pedido.dto;

import java.math.BigDecimal;
import java.util.List;

public record ItemPedidoResponseDto(
        Long id,
        Integer quantidade,
        BigDecimal precoUnitario,
        BigDecimal subtotal,
        List<ProdutoItemResponseDto> produtos
) {}
