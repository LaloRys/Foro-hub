package com.alura.foro_hub_challenge.domain.usuario_perfil;

import jakarta.validation.constraints.NotNull;

public record DatosRegistro_Usuario_Perfil(
        @NotNull
        Long usuario_id,
        @NotNull
        Long perfil_id
) {
}
