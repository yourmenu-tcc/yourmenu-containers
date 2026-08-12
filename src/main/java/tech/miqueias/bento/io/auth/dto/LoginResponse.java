package tech.miqueias.bento.io.auth.dto;

public record LoginResponse (
        String token,
        String tipo,
        long expiracaoEmSegundos
) {
    public LoginResponse(String token, long expiracaoEmSegundos) {
        this(token, "Bearer", expiracaoEmSegundos);
    }
}
