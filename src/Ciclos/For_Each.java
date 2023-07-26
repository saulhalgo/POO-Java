//También hay un ciclo " for-each ", que se usa exclusivamente para recorrer elementos en una matriz
package Ciclos;

public class For_Each {
	public static void main(String[] args) {
		// El siguiente ejemplo imprime cada uno de los valores de una matriz
		String[] carros = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : carros) {
			System.out.println(i);
		}

	}
}
