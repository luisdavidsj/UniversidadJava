package seccion3_TiposPrimitivos;

public class TipoFloat {

	public static void main(String[] args) {
		//Tipos primitivos del tipo flotante: float y double
		//Tipo float:
        float numeroFloat = (float) 3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float " + Float.MAX_VALUE);

        //Tipo double:
        double numeroDouble = 1.7976931348623157E308D; //La D es opcional
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double " + Double.MAX_VALUE);
	}

}
