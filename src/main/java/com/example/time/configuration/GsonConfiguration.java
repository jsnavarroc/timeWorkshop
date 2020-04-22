package com.example.time.configuration;import com.example.time.horaDia.domain.Hora;import com.example.time.horaDia.domain.Minuto;import com.example.time.horaDia.domain.Segundo;import com.example.time.horaDia.serialization.HoraAdapter;import com.example.time.horaDia.serialization.IntegerValueAdapter;import com.example.time.horaDia.serialization.MinutoAdapte;import com.example.time.horaDia.serialization.SegundoAdapter;import com.google.gson.Gson;import com.google.gson.GsonBuilder;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;@Configurationpublic class GsonConfiguration {    @Bean    public Gson gson(){        return new GsonBuilder()                   .registerTypeAdapter(Hora.class, new IntegerValueAdapter<>(Hora::of))                   .registerTypeAdapter(Minuto.class,  new IntegerValueAdapter<>(Minuto::of))                   .registerTypeAdapter(Segundo.class, new IntegerValueAdapter<>(Segundo::of))                   .create();    }}