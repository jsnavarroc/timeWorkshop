package com.example.time;


import com.example.time.horaDia.domain.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


import javax.xml.crypto.Data;
import java.util.function.Function;

@EnableConfigurationProperties
public class Prueba {
    public static Hora creator(Integer value, Function<Integer, Hora> creator){
            return creator.apply(value);
    }
    public static void main(String[] args) {
        Function<Integer, Hora> creatorHora = Hora::of;
        Function<Integer, Minuto> creatorMin = i -> Minuto.of(i);
        Function<Integer, Segundo> creatorSeg = new Function<Integer, Segundo>(){
            @Override
            public Segundo apply(Integer i) {
                return Segundo.of(i);
            }
        };


        Hora hora = creator(2, creatorHora);
        Minuto minuto = creatorMin.apply(1);
        Segundo segundo = creatorSeg.apply(3);
        System.out.println(hora);
        System.out.println(minuto);
        System.out.println(segundo);

        //System.out.println(DayTime.of(Hora.of(10), Minuto.of(12),Segundo.of(11)));
    }
}
