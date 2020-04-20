package com.example.time.configuration;

import com.example.time.configuration.domain.UnidadTiempoTipo;
import com.example.time.horaDia.domain.UnidadTiempoEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeDatasource {
    @Bean(name = "typeUnit")
    public UnidadTiempoEnum timeDataSource(UnidadTiempoTipo unidadTiempoTipo){
        UnidadTiempoEnum type =  UnidadTiempoEnum.valueOf(unidadTiempoTipo.getUnidadtiempo());
        return type;
    }
}
