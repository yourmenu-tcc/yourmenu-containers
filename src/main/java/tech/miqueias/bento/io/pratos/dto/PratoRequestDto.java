package tech.miqueias.bento.io.pratos.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PratoRequestDto(
        @NotBlank String nome,
        @NotBlank String descricao,
        @NotNull Long categoriaId,
        @NotNull @DecimalMin(value = "0.01") BigDecimal preco,
        String imagemUrl
) {
}
