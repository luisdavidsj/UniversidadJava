package seccion11_PasoPorValor;

public class PasoPorValor {

	//1. Crear metodo main
	public static void main(String[] args) {
		//4. Definimos una variable de tipo entero
		var x = 10;
		//5. Imprimimos el valor de la variable
		System.out.println("x = " + x);
		
		//6. Mandamos a llamar el metodo cambioValor y le pasamos como valor la variable x
		cambioValor(x);
		
		//9. Se vuelve a imprimir la variable x (ya habiendo intentando cambiarla desde otro metodo)
		System.out.println("x nuevo valor = " + x);
	}
	
	//2. Definicion de otro metodo (publico, no regresa nada (void) y es estatico (static), ya que el metodo main tambien es estatico)
	public static void cambioValor(int arg1) {//3. Vamos a recibir un argumento llamada arg1 de tipo primitivo, ya que el paso por valor aplica a los tipos primitivos
		//7. El metodo cambioValor recibe una copia de la variable x al argumento arg1
		System.out.println("arg1 = " + arg1);
		
		//8. Intentando realizar un cambio a la variable
		arg1 = 15;
	} 

}
