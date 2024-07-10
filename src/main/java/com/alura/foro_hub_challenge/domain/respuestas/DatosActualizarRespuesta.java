package com.alura.foro_hub_challenge.domain.respuestas;

import lombok.NonNull;

public record DatosActualizarRespuesta(
        @NonNull
        Long id,
        String mensaje,
        Boolean solucion
) {
}
