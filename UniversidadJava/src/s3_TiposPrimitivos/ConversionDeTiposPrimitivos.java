package s3_TiposPrimitivos;
import java.util.Scanner;

public class ConversionDeTiposPrimitivos {

	public static void main(String[] args) {
		//Conversión de tipos primitivos en Java parte 1
        //Convertir tipo String a un tipo int
        var edad2 = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad2 + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor 
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad2 = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad2);

        //Conversión de tipos primitivos en Java parte 2
        //Convertir tipo String a un tipo int
        var edad3 = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad3 + 1));

        var valorPI2 = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI2);

        //Pedir un valor 
        var consola2 = new Scanner(System.in);
        //System.out.println("Proporciona tu edad:");
        //edad = Integer.parseInt( consola.nextLine() );
        //System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter:");
        caracter = consola2.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
	}

}
