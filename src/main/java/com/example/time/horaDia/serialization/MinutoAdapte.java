package com.example.time.horaDia.serialization;

import com.example.time.horaDia.domain.Hora;
import com.example.time.horaDia.domain.Minuto;
import com.google.gson.*;

import java.lang.reflect.Type;

public class MinutoAdapte implements JsonDeserializer<Minuto>, JsonSerializer<Minuto> {

    @Override
    public Minuto deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Minuto.of(value);
    }

    @Override
    public JsonElement serialize(Minuto minuto, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = minuto.getValue();
        return new JsonPrimitive(value);
    }
}
