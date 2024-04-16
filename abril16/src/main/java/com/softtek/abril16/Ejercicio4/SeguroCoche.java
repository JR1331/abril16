package com.softtek.abril16.Ejercicio4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Component
@Data
public class SeguroCoche {
    @Autowired
    private ITaller taller;
    private String aseguradora;

    public String reparar (Coche c){
        return (taller.reparar(c));
    }

}
