package seccion6_Ciclos;

public class Break {

	public static void main(String[] args) {
		for( var contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 == 0){
                System.out.println("contador = " + contador);
                break;
            }   
        }
	}

}
