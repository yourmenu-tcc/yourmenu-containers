package tech.miqueias.bento.io.pedido.dto;

public record EnderecoPedidoResponseDto(
        Long zonaDeEntregaId,
        String cep,
        String cidade,
        String rua,
        String numero,
        String bairro,
        String complemento,
        String referencia
) {}
