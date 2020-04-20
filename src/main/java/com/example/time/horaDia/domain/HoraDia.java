package com.example.time.horaDia.domain;

import lombok.Value;

@Value
public class HoraDia {
    Hora hora;
    Minuto minuto;
    Segundo segundo;
    Integer diaHora;

    public static HoraDia from(Hora hora, Minuto minuto, Segundo segundo, Integer diaHora) {
        return new HoraDia(hora, minuto, segundo, diaHora);
    }
}
