package com.codezone.funciones.sentenciascontrol;

public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 * Usando un if, crear una condición que compare si la variable numeroIf es
		 * positivo, negativo, o 0.
		 */
		System.out.println("\n---Sentencia de Control if, else if, else---");
		var numeroIf = -3;

		if (numeroIf == 0) {
			System.out.println("el valor es Zero");
		} else if (numeroIf > 0) {
			System.out.println("El valor es positivo");
		} else {
			System.out.println("El valor es Negativo");
		}

		/*
		 * Crea un bucle While, este bucle tendrá que tener como condición que la
		 * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
		 * bucle deberá: Incrementar el valor de la variable en uno cada vez que se
		 * ejecute. Mostrarlo por pantalla cada vez que se ejecute.
		 */
		System.out.println("\n---Ciclo While---");
		var numeroWhile = 1;
		while (numeroWhile < 3) {
			System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
			numeroWhile++;
		}

		// Para el bucle Do While, deberás crear la misma estructura que en el While,
		// pero solo se debe ejecutar una vez.
		System.out.println("\n---Ciclo Do-While---");
		var numeroDowhile = -1;
		do {
			System.out.println(" El valor de la variable numeroWhile es: " + numeroDowhile);
		} while (numeroDowhile > 3);

		/*
		 * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
		 * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
		 * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
		 * pantalla.
		 */
		System.out.println("\n---Ciclo For---");
		var numeroFor = 0;
		for (; numeroFor <= 3; numeroFor++) {
			System.out.println("El valor de numeroFor es: " + numeroFor);
		}

		/*
		 * Para el Switch, deberás crear la variable estacion, y distintos case para las
		 * cuatro estaciones del año. Dependiendo del valor de la variable estacion se
		 * deberá mandar un mensaje por consola informando de la estación en la que
		 * está. También habrá que poner un default para cuando el valor de la variable
		 * no sea una estación.
		 */
		System.out.println("\n---Sentencia de control switch---");
		var estacion = "primavera";
		switch (estacion.toUpperCase()) {
		case "VERANO" -> System.out.println("La estacion es " + estacion);
		case "INVIERNO" -> System.out.println("La estacion es " + estacion);
		case "OTOÑO" -> System.out.println("La estacion es " + estacion);
		case "PRIMAVERA" -> System.out.println("La estacion es " + estacion);

		default -> System.out.println("Valor Inesperado: " + estacion);
		}

	}
}
