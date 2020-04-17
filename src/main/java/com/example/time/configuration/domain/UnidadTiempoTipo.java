package com.example.time.configuration.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "horadia")
@RequiredArgsConstructor
@Data
public class UnidadTiempoTipo {
    private String unidadtiempo;
}
