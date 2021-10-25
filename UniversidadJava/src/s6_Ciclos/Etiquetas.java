package s6_Ciclos;

public class Etiquetas {

	public static void main(String[] args) {
			inicio:
	        for( var contador = 0 ; contador < 3 ; contador++ ){
	            if( contador % 2 != 0){
	                continue inicio;//ir a la linea de codigo de la etiqueta
	            }   
	            System.out.println("contador = " + contador);
	        }
	}

}
