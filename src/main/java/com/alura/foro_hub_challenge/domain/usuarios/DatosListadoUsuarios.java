package com.alura.foro_hub_challenge.domain.usuarios;

public record DatosListadoUsuarios(
        Long id,
        String nombre
) {
    public DatosListadoUsuarios(Usuario usuario) {
        this(usuario.getId(), usuario.getNombre());
    }
}
