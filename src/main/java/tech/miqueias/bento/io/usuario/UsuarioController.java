package tech.miqueias.bento.io.usuario;

import jakarta.annotation.security.PermitAll;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import tech.miqueias.bento.io.usuario.dto.UsuarioResponseDTO;

import java.util.List;

@Path("/api/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Usuários", description = "Endpoints de visualização e gerenciamento de usuários")
@SecurityRequirement(name = "jwt")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Inject
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GET
    @Path("/all")
    @PermitAll
    public List<UsuarioResponseDTO> listarTodos() {
        return usuarioService.listarTodos();
    }

    @GET
    @Path("/{id}")
    @PermitAll
    public UsuarioResponseDTO buscarPorId(@PathParam("id") Long id) {
        return usuarioService.buscarPorId(id);
    }

}
