package com.example.time.horaDia.domain;

import java.time.LocalTime;

public enum UnidadTiempoEnum {
    MILISEGUNDOS,
    SEGUNDOS,
    MINUTOS,
    HORAS;

    public static Long fromHour(UnidadTiempoEnum unit, LocalTime hour){
        switch (unit){
            case HORAS:
                return null;
            case MINUTOS:
                return null;
            case SEGUNDOS:
                return null;
            case MILISEGUNDOS:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
