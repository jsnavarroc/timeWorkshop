package com.example.time.horaDia.services;

import com.example.time.horaDia.domain.UnidadTiempoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TimeServices {
    UnidadTiempoEnum timeDatasource;

    @Autowired
    public TimeServices(@Qualifier("typeUnit")UnidadTiempoEnum timeDatasource) {
        this.timeDatasource = timeDatasource;
    }

    public UnidadTiempoEnum getTimeDatasource() {
        return timeDatasource;
    }
}
