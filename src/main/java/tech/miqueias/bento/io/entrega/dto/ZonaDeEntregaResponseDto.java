package tech.miqueias.bento.io.entrega.dto;

import java.math.BigDecimal;

public record ZonaDeEntregaResponseDto(
        Long id,
        Long restauranteId,
        String localizacao,
        BigDecimal valor
) {
}
