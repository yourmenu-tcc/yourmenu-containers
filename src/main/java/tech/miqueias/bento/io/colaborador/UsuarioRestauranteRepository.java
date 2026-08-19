package tech.miqueias.bento.io.colaborador;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public class UsuarioRestauranteRepository implements PanacheRepository<UsuarioRestaurante> {

    public Optional<UsuarioRestaurante> buscar(Long usuarioId, Long restauranteId) {
        return find("usuario.id = ?1 and restaurante.id = ?2", usuarioId, restauranteId).firstResultOptional();
    }
}
