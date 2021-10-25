package s6_Ciclos;

public class Continue {

	public static void main(String[] args) {
		for( var contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 != 0){
                continue;//ir a la siguiente iteracion
            }   
            System.out.println("contador = " + contador);
        }
	}

}
