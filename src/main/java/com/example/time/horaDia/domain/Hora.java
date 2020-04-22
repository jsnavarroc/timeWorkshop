package com.example.time.horaDia.domain;

import com.example.time.common.Preconditions;
import com.example.time.horaDia.serialization.IntegerSerializable;
import lombok.Value;

@Value(staticConstructor = "of")
public class Hora implements IntegerSerializable {
    Integer value;

    private Hora(Integer value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkAgument(value >= 0 && value <= 23);
        this.value = value;
    }

    @Override
    public Integer valueOf() {
        return value;
    }
}
