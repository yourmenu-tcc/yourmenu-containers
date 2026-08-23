package tech.miqueias.bento.io.colaborador.dto;

import jakarta.validation.constraints.NotNull;
import tech.miqueias.bento.io.restaurante.StatusVinculoRestaurante;
import tech.miqueias.bento.io.usuario.Role;

public record ColaboradorRequestDto(
    @NotNull 
    Long usuarioId, 
    
    @NotNull 
    Role papel, 
    
    StatusVinculoRestaurante status
) {
}
