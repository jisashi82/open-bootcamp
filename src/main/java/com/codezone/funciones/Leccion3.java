package com.codezone.funciones;

public class Leccion3 {

	public static void main(String[] args) {

		/*
		 * Primera parte: Crear una función con tres parámetros que sean números que se
		 * suman entre sí. Llamar a la función en el main y darle valores.
		 */

		int n1 = 3, n2 = 6, n3 = 9;

		int resultado = sumar(n1, n2, n3);

		// System.out.println(sumar(n1,n2,n3));
		System.out.printf("El resultado de %d + %d + %d = %d %n", n1, n2, n3, resultado);

		/*
		 * Segunda parte Crear una clase coche. Dentro de la clase coche, una variable
		 * numérica que almacene el número de puertas que tiene. Una función que
		 * incremente el número de puertas que tiene el coche. Crear un objeto miCoche
		 * en el main y añadirle una puerta. Mostrar el número de puertas que tiene el
		 * objeto.
		 */

		Coche micoche = new Coche();
		micoche.addPuerta();
		micoche.addPuerta();
		micoche.addPuerta();
		micoche.addPuerta();
		// micoche.subPuerta();

		System.out.println("El numero de puertas del coche es: " + micoche.puertas);

	}

	public static int sumar(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

}

class Coche {
	public int puertas = 0;

	public void addPuerta() {
		this.puertas++;
	}

	public void subPuerta() {
		this.puertas--;
	}

}
