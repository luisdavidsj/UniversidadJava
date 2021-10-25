package s8_9_10_Metodos_Constructores_AlcanceVariables;

public class PruebaCaja {

	public static void main(String[] args) {
		int medidaAncho = 3;
		int medidaAlto = 2;
		int medidaProfundo = 6;
		
		Caja caja1 = new Caja();
		caja1.ancho = medidaAncho;
		caja1.alto = medidaAlto;
		caja1.profundo = medidaProfundo;
		int resultado = caja1.calcularVolumen();
		
		System.out.println("resultado de volumen de caja 1: " + resultado);
		
		
		Caja caja2 = new Caja(2,4,6);
		System.out.println("resultado de columen de caja 2: " + caja2.calcularVolumen());
		
	}

}
