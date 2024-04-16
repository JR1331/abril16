package com.softtek.abril16.ejercicio6.persistencia;

import com.softtek.abril16.ejercicio6.modelo.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ClienteDAO {
    @Autowired
    private IDAO conexion;

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }

}
