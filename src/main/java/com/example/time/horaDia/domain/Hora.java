package com.example.time.horaDia.domain;

import com.example.time.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hora {
    private final Integer value;

    private Hora(Integer value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkAgument(value >= 0 && value <= 23);
        this.value = value;
    }
}
