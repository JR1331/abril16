package com.softtek.abril16.ejercicio6.persistencia;

import com.softtek.abril16.ejercicio6.modelo.Cliente;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccesoProduccion implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Insertando al area de producción al Cliente: " + c1.getNombre() + " con NIF: " + c1.getNIF();
    }
}
