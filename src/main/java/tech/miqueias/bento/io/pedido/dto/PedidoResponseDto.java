package tech.miqueias.bento.io.pedido.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import tech.miqueias.bento.io.pedido.StatusPedido;
import tech.miqueias.bento.io.pedido.TipoEntrega;

public record PedidoResponseDto(
        Long id,
        Long restauranteId,
        LocalDateTime criadoEm,
        StatusPedido status,
        TipoEntrega tipoEntrega,
        BigDecimal precoProdutos,
        BigDecimal taxaEntrega,
        BigDecimal preco,
        PedidoClienteRequestDto cliente,
        EnderecoPedidoResponseDto endereco,
        List<ItemPedidoResponseDto> itens
) {}
