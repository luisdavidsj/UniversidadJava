package seccion15_Static_Test;

import seccion15_Static_Dominio.Persona;

public class PersonaPrueba {
	private int contador;

	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Karla");
       
        imprimir(persona1);
        imprimir(persona2);
        
        //this.contador = 10;
	}
	
	public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }

}
