package s5_SentenciasDeControl;

import java.util.Scanner;

public class IfElseEstacionAnoScanner {

	public static void main(String[] args) {
		System.out.println("Escribe el mes del a�o: ");
		Scanner consola = new Scanner(System.in);
		var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }
        else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio";
        }
        
        System.out.println("estacion = " + estacion);
	}

}
