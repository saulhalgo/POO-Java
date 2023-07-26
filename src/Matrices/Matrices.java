//Las matrices se utilizan para almacenar múltiples valores en una sola variable, en lugar de declarar variables separadas para cada valor.
package Matrices;

public class Matrices {
	public static void main(String[] args) {
		// Para declarar una matriz defina el tipo de
		// Los valores se insertan por medio de una matriz literal
		// Se coloca entre llaves y comas

		String[] carros = { "Volvo", "BMW", "Ford", "Mazda" };

		// Si se desea crear una matriz de enteros se escribe:

		int[] miNumero = { 10, 20, 30, 40 };

		// Para acceder a los elementos de la matriz se hace referencia al numero de la
		// variable

		System.out.println(carros[0]);
		System.out.println(miNumero[3]);
		// Recordar que empezamos a contar desde cero
	}

}
