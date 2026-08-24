package tech.miqueias.bento.io.pedido.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EnderecoPedidoRequestDto(
        @NotNull
        Long zonaDeEntregaId,

        @NotBlank
        String cep,

        @NotBlank
        String cidade,

        @NotBlank
        String rua,

        @NotBlank
        String numero,

        @NotBlank
        String bairro,

        String complemento,
        String referencia
) {}
