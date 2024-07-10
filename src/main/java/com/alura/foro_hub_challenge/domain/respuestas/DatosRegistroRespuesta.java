package com.alura.foro_hub_challenge.domain.respuestas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DatosRegistroRespuesta(
        @NotBlank
        String mensaje,
        @NotNull
        Long topico_id,
        @NotNull
        Long usuario_id
) {
}
