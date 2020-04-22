package com.example.time.horaDia.repositories;

import com.example.time.horaDia.domain.DayTime;
import com.example.time.horaDia.domain.Hora;
import com.example.time.horaDia.domain.Minuto;
import com.example.time.horaDia.domain.Segundo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("in-memory")
public class InMemoryDayTimeRepository implements DayTimesRepository {

    private final Map<Long, DayTime> state = new HashMap<>();


    @Override
    public DayTime insertOne(Hora hora, Minuto minuto, Segundo segundo) {
        Long id = state.size() +1L;
        DayTime dayTime = DayTime.from(hora, minuto, segundo);
        state.put(id, dayTime);
        return dayTime;
    }

    @Override
    public DayTime findAll() {
        return state.get(1);
    }
}
