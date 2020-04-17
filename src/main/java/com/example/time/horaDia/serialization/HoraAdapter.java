package com.example.time.horaDia.serialization;

import com.example.time.horaDia.domain.Hora;
import com.google.gson.*;

import java.lang.reflect.Type;

public class HoraAdapter implements JsonDeserializer<Hora>, JsonSerializer<Hora> {

    @Override
    public Hora deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Hora.of(value);
    }

    @Override
    public JsonElement serialize(Hora hora, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = hora.getValue();
        return new JsonPrimitive(value);
    }
}
