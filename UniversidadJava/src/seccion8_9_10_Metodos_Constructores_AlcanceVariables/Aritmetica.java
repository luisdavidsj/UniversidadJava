package seccion8_9_10_Metodos_Constructores_AlcanceVariables;

public class Aritmetica {
	//Atributos de la clase
	int a;
	int b;
	
	//Constructor vacio:
	//Este constructor vacío se va a agregar siempre y cuando no haya otro constructor con argumentos.
	public Aritmetica(){
		System.out.println("Ejecutando constructor");
	}
	
	//Sobrecarga de constructores:
	public Aritmetica(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Ejecutando constructor con argumentos");
		
	}
	
	//Metodo
	public void sumar() {
		int resultado = this.a + this.b;
		System.out.println("resultado = " + resultado);
	}
	
	//Tambien se ve el uso del operador this en java:
	public int sumarConRetorno() {
		//int resultado = a + b;
		//return resultado;
		return this.a + this.b;
	}
	
	//Método que recibe argumentos
	public int sumarConArgumentos(int arg1, int arg2) {
		this.a = arg1;
		this.b = arg2;
		//return a + b;
		return this.sumarConRetorno();
	}
	
}
