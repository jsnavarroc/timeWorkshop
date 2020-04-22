package com.example.time.horaDia.repositories;

import com.example.time.horaDia.domain.DayTime;
import com.example.time.horaDia.domain.Hora;
import com.example.time.horaDia.domain.Minuto;
import com.example.time.horaDia.domain.Segundo;
import org.springframework.stereotype.Repository;

@Repository
public interface DayTimesRepository {
    DayTime insertOne(Hora hora, Minuto minuto, Segundo segundo);
    DayTime findAll();
}
