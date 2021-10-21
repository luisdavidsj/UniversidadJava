package s16_herencia_test;

import s16_herencia_domain.Cliente;
import s16_herencia_domain.Empleado;
import s16_herencia_domain.Persona;

import java.util.Date;

public class TestHerencia {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan", 5000.0);
		System.out.println("empleado1 = " + empleado1);
		
		//var fecha = new Date();
		//Cliente cliente1 = new Cliente(fecha, true, "Karla", 'F', 28, "Saturno15");
		//System.out.println("cliente1 = " + cliente1);
		
		//Persona persona1 = new Persona();
	}

}
