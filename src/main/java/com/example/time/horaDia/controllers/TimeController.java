package com.example.time.horaDia.controllers;

import com.example.time.horaDia.domain.Hora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("api/v1/time")
public class TimeController {

    @GetMapping("/hora")
    public Hora getDayHour() {
        LocalTime now = LocalTime.now();
       return Hora.of(now.getHour());
    }
}
