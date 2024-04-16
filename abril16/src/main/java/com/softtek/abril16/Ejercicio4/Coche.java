package com.softtek.abril16.Ejercicio4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Coche {
    private String matricula;

    private String modelo;
  }



