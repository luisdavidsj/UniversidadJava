package seccion3_TiposPrimitivos;

public class TipoInt {

	public static void main(String[] args) {
		// Tipos primitivos del tipo entero: byte, short, int, long
		//Tipo byte:
        byte numeroByte = (byte) 129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        //Tipo short:
        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        //Tipo int:
        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo: " + Integer.MAX_VALUE);

        //Tipo long:
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
	}

}
