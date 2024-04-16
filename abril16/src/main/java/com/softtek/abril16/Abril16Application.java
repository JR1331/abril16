package com.softtek.abril16;

import com.softtek.abril16.Ejercicio4.Coche;
import com.softtek.abril16.Ejercicio4.SeguroCoche;
import com.softtek.abril16.Ejercicio5.Director;
import com.softtek.abril16.Ejercicio5.Informe;
import com.softtek.abril16.ejercicio1.modelo.Saludo;
import com.softtek.abril16.ejercicio6.modelo.Cliente;
import com.softtek.abril16.ejercicio6.persistencia.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {

	@Autowired
	//private Coche c1;
	//private Saludo s1;
	//private Informe if1; Por algun motivo no lo necesita la declaracion de un informe
	private Cliente c1;
	@Autowired
	//private SeguroCoche sc;
	//private Director d1;
	private ClienteDAO cli;
	public static void main(String[] args) {
		SpringApplication.run(Abril16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(s1.saludar());
		//System.out.println(sc.reparar(c1));
		//System.out.println(d1.getTareas());
		//System.out.println(d1.getInforme());
		System.out.println(cli.insertar(c1));
	}
}
