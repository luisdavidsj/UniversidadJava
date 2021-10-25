package s2_Variables;

public class Concatenacion {

	public static void main(String[] args) {
		//Concatenacion
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);//Se realiza la suma de números
        System.out.println(i + j + usuario);//Evaluacion de izq a der, se realiza suma
        System.out.println(usuario + i + j);//Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j));//Uso de parentesis modifican la prioridad en la evaluación
	}

}
