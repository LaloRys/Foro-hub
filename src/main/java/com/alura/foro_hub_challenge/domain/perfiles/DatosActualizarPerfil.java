package com.alura.foro_hub_challenge.domain.perfiles;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarPerfil(
        @NotNull
        Long id,
        @NotBlank
        String nombre
) {
}
