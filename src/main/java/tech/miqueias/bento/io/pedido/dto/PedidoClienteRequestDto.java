package tech.miqueias.bento.io.pedido.dto;

import jakarta.validation.constraints.NotBlank;

public record PedidoClienteRequestDto(
        @NotBlank
        String primeiroNome,

        String ultimoNome,

        @NotBlank
        String telefone
) {}
