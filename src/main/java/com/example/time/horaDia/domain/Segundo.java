package com.example.time.horaDia.domain;

import com.example.time.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Segundo {
    Integer value;

    private Segundo(Integer value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkAgument(value >=0 && 59 <= value);
        this.value = value;
    }
}
