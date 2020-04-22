package com.example.time.horaDia.domain;

import com.example.time.common.Preconditions;
import com.example.time.horaDia.serialization.IntegerSerializable;
import lombok.Value;

@Value(staticConstructor = "of")
public class Segundo implements IntegerSerializable {
    Integer value;

    private Segundo(Integer value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkAgument(value >=0 && value <= 59);
        this.value = value;
    }

    @Override
    public Integer valueOf() {
        return value;
    }
}
