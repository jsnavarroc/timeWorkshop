package com.example.time.horaDia.domain;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;


public enum UnidadTiempoEnum {
    MILISEGUNDOS,
    SEGUNDOS,
    MINUTOS,
    HORAS;

    @Bean
    public static Long fromHour(UnidadTiempoEnum unit, LocalTime time){
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int millisecond = time.getNano();

        switch (unit){
            case HORAS:
                return Long.valueOf(hour);
            case MINUTOS:
                return hour*(60L)+minute;
            case SEGUNDOS:
                return second + hour*(60L*60L)+ minute*(60L);
            case MILISEGUNDOS:
                return (millisecond*(1000000L)) + (second *(1000L)) + (hour*(60L*60L*1000L)) + (minute*(60L * 1000L));
            default:
                throw new UnsupportedOperationException();
        }
    }
}
