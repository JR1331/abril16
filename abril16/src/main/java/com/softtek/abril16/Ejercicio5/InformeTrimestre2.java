package com.softtek.abril16.Ejercicio5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InformeTrimestre2 implements Informe{
    @Override
    public String getInforme() {
        return "Informe2";
    }
}
