package com.example.time.horaDia.services;

import com.example.time.horaDia.domain.*;
import com.example.time.horaDia.repositories.DayTimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayTimesService {
    private final DayTimesRepository dayTimesRepository;

    @Autowired
    public DayTimesService(@Qualifier("in-memory") DayTimesRepository dayTimesRepository) {
        this.dayTimesRepository = dayTimesRepository;
    }

    public DayTime insertOne(Hora hora, Minuto minuto, Segundo segundo){
        return dayTimesRepository.insertOne(hora,minuto,segundo);
    }

    public List<DayTime> findAll(){return dayTimesRepository.findAll();}
}
