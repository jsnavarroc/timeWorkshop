package com.example.time.horaDia.serialization;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public interface GsonAdapter<T> extends JsonDeserializer<T>, JsonSerializer<T> {
    public  static <T> Integer toInteger (T object) {
        return (Integer) object;
    }
}
