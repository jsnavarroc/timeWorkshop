package com.example.time.horaDia.services;

import com.example.time.horaDia.domain.DayTime;
import com.example.time.horaDia.domain.Hora;
import com.example.time.horaDia.domain.Minuto;
import com.example.time.horaDia.domain.Segundo;
import com.example.time.horaDia.repositories.DayTimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DayTimesServices {
    private final DayTimesRepository dayTimesRepository;

    @Autowired
    public DayTimesServices(@Qualifier("in-memory") DayTimesRepository dayTimesRepository) {
        this.dayTimesRepository = dayTimesRepository;
    }

    public DayTime insertOne(Hora hora, Minuto minuto, Segundo segundo){
        return dayTimesRepository.insertOne(hora,minuto,segundo);
    }

    public DayTime findAll(){return dayTimesRepository.findAll();}
}
