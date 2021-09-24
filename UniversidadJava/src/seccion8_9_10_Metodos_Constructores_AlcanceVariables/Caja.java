package seccion8_9_10_Metodos_Constructores_AlcanceVariables;

public class Caja {
	int ancho;
	int alto;
	int profundo;
	
	public Caja() {
		System.out.println("Ejecutando constructor");
	}
	
	public Caja(int ancho, int alto, int profundo) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
	}
	
	public int calcularVolumen() {
		return ancho * alto * profundo;
	}
}
