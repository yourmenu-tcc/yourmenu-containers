package tech.miqueias.bento.io.pedido.dto;

import jakarta.validation.constraints.NotNull;
import tech.miqueias.bento.io.pedido.StatusPedido;

public record AlterarStatusPedidoRequestDto(
        @NotNull
        StatusPedido status
) {}
