package tech.miqueias.bento.io.pratos.dto;

import java.math.BigDecimal;

public record PratoResponseDto(
        Long id,
        Long restauranteId,
        Long categoriaId,
        String nome,
        String descricao,
        BigDecimal preco,
        String imagemUrl
) {}
