//Una matriz multidimensional es una matriz de matrices.
package Matrices;

public class Matrices_Multidimencionales {
	public static void main(String[] args) {
		int[][] miNumero = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } }; // -------> agregar cada matriz dentro de sus respectivas
																// llaves

		// [] El primer indice es de la matriz
		// [] El segundo elemeto es para el elemento de esa matriz

		int x = miNumero[1][2]; // La variable x almacena el primer y segundo elemento
								// Recordar que se empieza a contar desde 0 matriz (2) elemento (3)

		System.out.println(x);

	}
}
