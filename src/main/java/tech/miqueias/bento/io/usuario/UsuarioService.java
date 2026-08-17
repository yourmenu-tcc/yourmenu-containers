package tech.miqueias.bento.io.usuario;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import tech.miqueias.bento.io.shared.exeption.RecursoNaoEncontradoException;
import tech.miqueias.bento.io.usuario.dto.UsuarioResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Inject
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioResponseDTO> listarTodos() {
        return usuarioRepository.listarTodos().stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }

    public UsuarioResponseDTO buscarPorId(Long id) {
        Usuario usuario = usuarioRepository.buscarPorId(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Usuário", id));
        return toResponseDTO(usuario);
    }

    private UsuarioResponseDTO toResponseDTO(Usuario u) {
        return new UsuarioResponseDTO(u.getId(), u.getNome(), u.getEmail(), u.getRoles());
    }
}
