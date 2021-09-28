package s16_herencia_domain;

public class Empleado extends Persona{
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado(String nombre, double sueldo) {
		super(nombre);
		this.idEmpleado = ++Empleado.contadorEmpleado;
		this.sueldo = sueldo;
	}
	
	public int getIdEmpleado() {
		return this.idEmpleado;
	}
	
	//No vamos a utilizar el metodo set para idEmpleado, ya que el constructor es el que se va a encargar de asignar el valor al atributo de idEmpleado:
	/*public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}*/
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
		sb.append(", sueldo=").append(this.sueldo);
		sb.append(", ").append(super.toString()).append("}");
		sb.append("}");
		return sb.toString();
	}
	
}
