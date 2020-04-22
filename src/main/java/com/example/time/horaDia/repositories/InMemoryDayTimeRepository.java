package com.example.time.horaDia.repositories;

import com.example.time.horaDia.domain.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("in-memory")
public class InMemoryDayTimeRepository implements DayTimesRepository {
    private List<DayTime> dayTimes = new ArrayList();

    @Override
    public DayTime insertOne(Hora hora, Minuto minuto, Segundo segundo) {
        DayTime dayTime = DayTime.of(hora, minuto, segundo);
        dayTimes.add(dayTime);
        return dayTime;
    }

    @Override
    public List<DayTime> findAll() {
        return dayTimes;
    }
}
