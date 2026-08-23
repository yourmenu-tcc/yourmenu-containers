package tech.miqueias.bento.io.categoria.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoriaRequestDto(
        @NotBlank String nome,
        String descricao
) {
}
