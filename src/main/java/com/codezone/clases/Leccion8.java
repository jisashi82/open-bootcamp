package com.codezone.clases;

/*
 * Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.*/

public class Leccion8 {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.setEdad(20);
		persona1.setNombre("Abel");
		persona1.setTelefono("9621232222");

		Persona persona2 = new Persona(40, "Jisashi", "9621233333");

		System.out.printf("La Persona 1 se llama %s tiene %d y su numero telefonico es %s \n", persona1.getNombre(),
				persona1.getEdad(), persona1.getTelefono());
		System.out.printf("La Persona 2 se llama %s tiene %d y su numero telefonico es %s", persona2.getNombre(),
				persona2.getEdad(), persona2.getTelefono());

	}

}

class Persona {
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

}
