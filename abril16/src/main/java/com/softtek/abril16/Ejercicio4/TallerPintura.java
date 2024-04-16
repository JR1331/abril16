package com.softtek.abril16.Ejercicio4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TallerPintura implements ITaller{

    @Override
    public String reparar(Coche c) {
        return "Reparacion de pintura";
    }
}
