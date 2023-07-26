package Matrices;

public class Ejercicio {
	public static void main(String[] args) {
		int[][] numeros = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println(numeros[i][j]);
			}
			// Explicacion del codigo
			/*
			 * recordemos que tenemos dos elementos, el primero [i] son las filas [j] son
			 * las columnas ¿" i " es menor al numero de filas que tenemos ? " i " tiene el
			 * valor inicial de 0 y tenemos dos, filas entonces entra el primer codigo sin
			 * aumentarlo ¿" j " es menor al numero de columnas en el primer elmento?
			 * entoces imprime los primeros 4 valores como ya termino el segundo ciclo
			 * regresa al primer ciclo de filas y aumenta en 1 ahora " i " vale 1 y sigue
			 * siendo menor que el numero de filas pasa al siguiente ciclo donde " j "
			 * vuelve a ser 0 ¿" j " es menor al numero de columnas en el segundo elmento
			 * imprime todos los valores de la segunda fila ahora " i " tiene el valor de
			 * dos ¿2 es menor al numero de filas? se detiene el ciclo
			 */

		}
	}
}
