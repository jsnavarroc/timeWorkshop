package com.example.time.horaDia.repositories;

import com.example.time.horaDia.domain.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DayTimesRepository {
    DayTime insertOne(Hora hora, Minuto minuto, Segundo segundo);
    List<DayTime> findAll();
}
