package tech.miqueias.bento.io.entrega.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ZonaDeEntregaRequestDto(
        @NotBlank String localizacao,
        @NotNull @DecimalMin("0.0") BigDecimal valor
) {
}
