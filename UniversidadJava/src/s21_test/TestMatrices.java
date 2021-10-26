package s21_test;

import s21_domain.Persona;

public class TestMatrices {

	public static void main(String[] args) {
		int edades[][] = new int[3][2];
		System.out.println("edades = " + edades);
		
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		
		System.out.println("edades 0-0 = " + edades[0][0]);
		System.out.println("edades 0-0 = " + edades[0][1]);
		System.out.println("edades 0-0 = " + edades[1][0]);
		System.out.println("edades 0-0 = " + edades[1][1]);
		
		for (int ren = 0; ren < edades.length; ren++) {
			for (int col = 0; col < edades[ren].length; col++) {
				System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);
			}
		}
		
		//Sintaxis simlpificada:
		String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora","Mora"}};
		imprimir(frutas);
		
		Persona personas[][] = new Persona[2][3];
		personas[0][0] = new Persona("Juan");
		personas[0][1] = new Persona("Karla");
		personas[0][2] = new Persona("Pedro");
		personas[1][0] = new Persona("Jorge");
		personas[1][1] = new Persona("Ana");
		personas[1][2] = new Persona("Daniel");
		imprimir(personas);
	}
	
	public static void imprimir(Object matriz[][]) {
		for (int ren = 0; ren < matriz.length; ren++) {
			for (int col = 0; col < matriz[ren].length; col++) {
				System.out.println("frutas " + ren + "-" + col + ": " + matriz[ren][col]);
			}
		}
	}
}
