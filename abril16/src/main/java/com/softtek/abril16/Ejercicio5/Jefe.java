package com.softtek.abril16.Ejercicio5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Jefe implements Empleado{
    @Autowired
    private Informe informe;

    @Override
    public String getTareas() {
        return "tareas del jefe";
    }

    @Override
    public String getInforme() {
        return  "Informe del jefe"+(informe.getInforme());
    }
}
