package tech.miqueias.bento.io.categoria.dto;

public record CategoriaResponseDto(
    Long id, 
    Long restauranteId, 
    String nome, 
    String descricao
) {
}
