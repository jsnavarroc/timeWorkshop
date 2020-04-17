package com.example.time.horaDia.domain;

import com.example.time.common.Preconditions;

import java.util.regex.Pattern;

public class UnidadTiempo {

    public static UnidadTiempo of(String value){
        return new UnidadTiempo(value);
    }


    private final String value;

    private UnidadTiempo(String value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkAgument(value.matches("Milisegundos|Segundos|Minutos|Horas"));
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "UnidadTiempo{" +
                "value='" + value + '\'' +
                '}';
    }
}
