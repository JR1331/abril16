package com.softtek.abril16.Ejercicio5;

import org.springframework.stereotype.Component;

@Component
public class InformeTrimestre1 implements Informe{
    @Override
    public String getInforme() {
        return "informe1";
    }
}
