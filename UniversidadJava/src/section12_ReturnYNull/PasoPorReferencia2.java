package section12_ReturnYNull;

import seccion7_Clases.Persona;

public class PasoPorReferencia2 {
	public static void main(String[] args) {
        //Persona persona1 = new Persona();
        Persona persona2 = null;
        //persona1.nombre = "Juan";
        //System.out.println("persona1 nombre: " + persona1.nombre);
        persona2 = cambiarValor(persona2);
        //System.out.println("persona1 cambio nombre:" + persona1.nombre);
    }
    
    public static Persona cambiarValor(Persona persona){
        if(persona == null){
            System.out.println("valor de persona invalido : null");
            return null;
        }
        //Esto no se ejecuta:
        persona.nombre = "Karla";
        return persona;
    }
}
