package tech.miqueias.bento.io.usuario.dto;
import java.util.Set;
import jakarta.validation.constraints.*;
import tech.miqueias.bento.io.usuario.Role;
public record UsuarioAtualizacaoRequestDTO(@NotBlank String nome, @NotBlank @Email String email, @NotEmpty Set<Role> roles) { }
