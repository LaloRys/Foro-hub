package com.alura.foro_hub_challenge.domain.perfiles;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroPerfil(
        @NotBlank
        String nombre
) {
}
