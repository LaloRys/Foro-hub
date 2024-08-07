package com.alura.foro_hub_challenge.domain.respuestas;

import java.time.LocalDateTime;

public record DTOpicoRespuestas(
        String mensaje,
        LocalDateTime fecha,
        String nombre,
        Boolean solucion
) {
    public DTOpicoRespuestas(Respuesta respuesta) {
        this(respuesta.getMensaje(), respuesta.getFecha(), respuesta.getUsuario().getNombre(), respuesta.getSolucion());
    }
}
