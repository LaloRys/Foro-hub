package com.alura.foro_hub_challenge.domain.cursos;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroCurso(

        @NotBlank
        String nombre,
        @Nullable
        String categoria
) {
}
