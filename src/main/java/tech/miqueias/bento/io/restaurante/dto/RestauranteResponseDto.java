package tech.miqueias.bento.io.restaurante.dto;

import java.time.LocalTime;

public record RestauranteResponseDto(
        Long id,
        String nome,
        String descricao,
        boolean aberto,
        String endereco,
        LocalTime horaAbertura,
        LocalTime horaFechamento,
        Integer tempoDeEntrega,
        String logoUrl,
        String bannerUrl,
        String acessoUrl
) {
}
