package com.example.time.horaDia.controllers;

import com.example.time.horaDia.domain.Hora;
import com.example.time.horaDia.domain.UnidadTiempo;
import com.example.time.horaDia.domain.UnidadTiempoEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("api/v1/time")
public class TimeController {

    @GetMapping("/hora")
    public Hora getDayHour() {
        LocalTime now = LocalTime.now();
        Hora hora = Hora.of(now.getHour());
        UnidadTiempoEnum type =  UnidadTiempoEnum.valueOf("HORAS");
        UnidadTiempoEnum.fromHour(type, LocalTime.now());

        //UnidadTiempoEnum hora = UnidadTiempoEnum.valueOf("HORAS");
        UnidadTiempoEnum.ofRe();
        System.out.println("hora>"+ hora);

        return hora;
    }
}
