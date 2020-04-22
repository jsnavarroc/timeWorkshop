package com.example.time.horaDia.controllers;

import com.example.time.horaDia.domain.*;
import com.example.time.horaDia.services.TimeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("api/v1/time")
@RequiredArgsConstructor
public class TimeController {
    private final TimeServices timeServices;

    @GetMapping("/horaTipo")
    public Object getHoraTipo()  {
        UnidadTiempoEnum type =  timeServices.getTimeDatasource();
        Object value = UnidadTiempoEnum.fromHour(type, LocalTime.now());
        return value;
    }

    @GetMapping("/horaActual")
    public Object getHoraActual()  {
        Hora hora = Hora.of(10);
        Minuto minuto = Minuto.of(30);
        Segundo segundo = Segundo.of(31);
        String horaDíaNow = hora.getValue()+":"+minuto.getValue()+":"+segundo.getValue();
        UnidadTiempoEnum type =   timeServices.getTimeDatasource();
        Integer value = Math.toIntExact(UnidadTiempoEnum.fromHour(type, LocalTime.parse(horaDíaNow)));
        return HoraDia.from(hora,minuto,segundo, value);
    }
}
