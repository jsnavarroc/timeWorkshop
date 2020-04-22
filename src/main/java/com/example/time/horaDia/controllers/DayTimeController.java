package com.example.time.horaDia.controllers;

import com.example.time.horaDia.domain.*;
import com.example.time.horaDia.services.DayTimesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/times")
@RequiredArgsConstructor
public class DayTimeController {
    private final DayTimesService dayTimesService;

    @PostMapping
    public DayTime insertOne(@RequestBody DayTime dayTime) {
        return dayTimesService.insertOne(dayTime.getHora(), dayTime.getMinuto(), dayTime.getSegundo());
    }

    @GetMapping
    public List<DayTime> getAllDayTime(){
        return dayTimesService.findAll();
    }
}
