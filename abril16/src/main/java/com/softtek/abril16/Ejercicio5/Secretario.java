package com.softtek.abril16.Ejercicio5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Secretario implements Empleado{
    @Autowired
    private Informe informe;
    private String empresa;
    private String email;

    @Override
    public String getTareas() {
        return "tareas del secretario";
    }
    @Override
    public String getInforme() {
        return "informe del secretario"+(informe.getInforme());
    }

}
