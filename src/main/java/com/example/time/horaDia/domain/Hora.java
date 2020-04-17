package com.example.time.horaDia.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Hora {
    private final Integer value;

    private Hora(Integer value) {
        this.value = value;
    }
}
