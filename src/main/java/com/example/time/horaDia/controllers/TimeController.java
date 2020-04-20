package com.example.time.horaDia.controllers;

import com.example.time.horaDia.domain.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("api/v1/time")
public class TimeController {

    UnidadTiempoEnum timeDatasourc;

    public TimeController(@Qualifier("typeUnit")UnidadTiempoEnum timeDatasourc) {
        this.timeDatasourc = timeDatasourc;
    }


    @GetMapping("/horaTipo")
    public Object getHoraTipo()  {
        UnidadTiempoEnum type =  timeDatasourc;
        Object value = UnidadTiempoEnum.fromHour(type, LocalTime.now());
        return value;
    }

    @GetMapping("/horaActual")
    public Object getHoraActual()  {
        Hora hora = Hora.of(10);
        Minuto minuto = Minuto.of(30);
        Segundo segundo = Segundo.of(31);
        String horaDíaNow = hora.getValue()+":"+minuto.getValue()+":"+segundo.getValue();
        UnidadTiempoEnum type =  timeDatasourc;
        Integer value = Math.toIntExact(UnidadTiempoEnum.fromHour(type, LocalTime.parse(horaDíaNow)));
        return HoraDia.from(hora,minuto,segundo, value);
    }
}
