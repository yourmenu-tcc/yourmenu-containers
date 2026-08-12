package tech.miqueias.bento.io.auth;

import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import tech.miqueias.bento.io.auth.dto.LoginRequest;
import tech.miqueias.bento.io.auth.dto.LoginResponse;
import tech.miqueias.bento.io.usuario.dto.UsuarioRequestDTO;
import tech.miqueias.bento.io.usuario.dto.UsuarioResponseDTO;

import java.net.URI;
import java.util.List;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/api/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Autenticação", description = "Endpoints de autenticação e gerenciamento de usuários")
@SecurityRequirement(name = "jwt")
public class AuthController {

    private final AuthService authService;

    @Inject
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @POST
    @Path("/registrar")
    @PermitAll
    public Response registrar(@Valid UsuarioRequestDTO dto) {
        UsuarioResponseDTO usuario = authService.criarUsuario(dto);
        return Response.created(URI.create("/api/auth/usuarios/" + usuario.id()))
                .entity(usuario)
                .build();
    }

    @POST
    @Path("/login")
    @PermitAll
    public Response login(@Valid LoginRequest dto) {
        LoginResponse token = authService.login(dto);
        return Response.ok(token).build();
    }

    @GET
    @Path("/usuarios")
    @RolesAllowed({"ADMINISTRADOR", "GERENTE"})
    public List<UsuarioResponseDTO> listarTodos() {
        return authService.listarTodos();
    }

    @GET
    @Path("/usuarios/{id}")
    @RolesAllowed({"ADMINISTRADOR", "GERENTE"})
    public UsuarioResponseDTO buscarPorId(@PathParam("id") Long id) {
        return authService.buscarPorId(id);
    }

    @GET
    @Path("/test-auth")
    @RolesAllowed({"ADMINISTRADOR", "GERENTE"})
    public Response testAuth() {
        return Response.ok("Autenticação funcionando com sucesso.").build();
    }
}

