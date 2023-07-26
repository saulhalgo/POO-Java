//Los bucles pueden ejecutar un bloque de c�digo siempre que se alcance una "condici�n" espec�fica.
package Ciclos;

public class While {
	public static void main(String[] args) {
		// En el siguiente ejemplo, el c�digo en el ciclo se ejecutar� una y otra vez
		// siempre que una variable (i) sea menor que 5:

		int i = 0; // -------> " i " tiene le valor de 0
		while (i < 5) { // ------> mientras que " i " sea menor a 5
			System.out.println(i);// -------> imprime el valor de " i "
			i++; // -------> aumenta en 1 el valor de " i "

			// Si no se llega a aumentar el valor de i se volvera un ciclo infinito

		}

	}

}
