package com.softtek.abril16.Ejercicio5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Director implements  Empleado{
    @Autowired
    private Informe informe;

    @Override
    public String getTareas() {
        return "tareas del director";
    }

    @Override
    public String getInforme() {
        return "Informe del director "+(informe.getInforme());
    }


}
