package com.softtek.abril16.ejercicio1.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Saludo {
    public String saludar(){
      return "Buenos dias samuel david";
    };
}
