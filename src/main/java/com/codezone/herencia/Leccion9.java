package com.codezone.herencia;

/*
 * Crea una clase Persona con las siguientes variables:
 * La edad
 * El nombre
 * El teléfono
 * 
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
 * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.*/

public class Leccion9 {

	public static void main(String[] args) {
		Cliente cliente= new Cliente(33, "Abel", "9621232222", 3000);
		System.out.println(cliente.toString() + " credito: " +cliente.getCredito());
		
		Trabajador trabajador= new Trabajador();
		trabajador.setEdad(40);
		trabajador.setNombre("Jisashi");
		trabajador.setTelefono("9621234444");
		trabajador.setSalario(25560.33);;
		System.out.println(trabajador.toString() + " salario: " +trabajador.getSalario());
	}

}


class Persona{
	private int edad;
	private String nombre;
	private String telefono;
	
	public Persona() {
	}

	public Persona(int edad, String nombre, String telefono) {
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
}

/*-----------Definicion de la clase Cliente-------------*/
class Cliente extends Persona{
	private int credito = 0;
	
	public Cliente() {
	}

	public Cliente(int edad, String nombre, String telefono, int credito) {	
		super(edad,nombre,telefono);
		this.credito = credito;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	/*
	 * @Override 
	 * public String toString() { 
	 * return "Cliente [credito=" + getCredito() + ", Edad=" + getEdad() + ", Nombre=" + getNombre() + ", Telefono=" + getTelefono() + "]"; 
	 * }
	 */
	
}

/*-----------Definicion de la clase Trabajador-------------*/
class Trabajador extends Persona{
	private double salario=0.0;

	public Trabajador() {
	}
	
	public Trabajador(int edad, String nombre, String telefono, double salario) {
		super(edad, nombre, telefono);
		this.salario =salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//@Override
	//public String toString() {
		//return "Trabajador [" + "edad=" + getEdad() + ", nombre=" + getNombre() + ", telefono=" + getTelefono() + ", salario=" + getSalario() +"]";
	//}
	
	
	
}
