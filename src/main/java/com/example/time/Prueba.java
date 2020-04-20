package com.example.time;

import com.example.time.configuration.domain.DatabaseCredentials;
import com.example.time.configuration.domain.UnidadTiempoTipo;
import com.example.time.horaDia.domain.Hora;
import com.example.time.horaDia.domain.HoraDia;
import com.example.time.horaDia.domain.UnidadTiempoEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.time.LocalTime;

@EnableConfigurationProperties
public class Prueba {
    @Value("${horadia}")
    private String unidadtiempo;

    public static void main(String[] args) {
        UnidadTiempoEnum type =  UnidadTiempoEnum.valueOf("HORAS");
        System.out.println(type);

    }
}
