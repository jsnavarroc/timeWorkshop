package com.example.time.horaDia.domain;

import com.example.time.configuration.domain.UnidadTiempoTipo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;


public enum UnidadTiempoEnum {
    MILISEGUNDOS,
    SEGUNDOS,
    MINUTOS,
    HORAS;

    @Value("${horadia}")
    private static String unidadtiempo;
    @Bean
    public static Long fromHour(UnidadTiempoEnum unit, LocalTime time){
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int millisecond = time.getNano();

        switch (unit){
            case HORAS:
                return  Long.valueOf(hour*(60L)+minute);
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


    @Bean()
    public static void ofRe(){
        System.out.println(">>>>"+unidadtiempo);
        HoraDia horaDia = new HoraDia();
        System.out.println(">>>>"+horaDia.getUnidadtiempo());
        UnidadTiempoTipo unidadTiempoTipo = new UnidadTiempoTipo();
        System.out.println(">>>>"+unidadTiempoTipo.getUnidadtiempo());

    }
}
