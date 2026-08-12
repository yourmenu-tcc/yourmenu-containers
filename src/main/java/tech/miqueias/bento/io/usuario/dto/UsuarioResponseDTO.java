package tech.miqueias.bento.io.usuario.dto;

import tech.miqueias.bento.io.usuario.Role;

import java.util.Set;

public record UsuarioResponseDTO(
        Long id,
        String nome,
        String email,
        Set<Role> roles
) {
}
