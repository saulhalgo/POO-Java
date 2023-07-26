//También hay un ciclo " for-each ", que se usa exclusivamente para recorrer elementos en una matriz 
//Con anterioridad lo vimos, ahora vamos a repasarlo 
package Matrices;

public class Bucle_Matriz_ForEach {
	public static void main(String[] args) {
		String[] carros = { "Volvo", "BMW", "Ford", "Mazda" };

		for (String i : carros) {
			System.out.println(i);

			// Este ciclo evita el contador y el metodo length y imprime el mismo resultado
		}
	}

}
