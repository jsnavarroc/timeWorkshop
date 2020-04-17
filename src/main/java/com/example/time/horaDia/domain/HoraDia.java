package com.example.time.horaDia.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@RequiredArgsConstructor
public class HoraDia {
    @Value("${horadia.unidadtiempo}")
    private String unidadtiempo;
}
