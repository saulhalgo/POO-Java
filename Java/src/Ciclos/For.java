//Cuando sepa exactamente cuántas veces desea recorrer un bloque de código, use el "for" bucle en lugar de un "while" bucle
package Ciclos;

public class For {
	public static void main(String[] args) {
		// Imprimir numeros del 0 al 4

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Imprimir valores entre el 0 y el 10
		for (int a = 0; a <= 10; a = a + 2) // a vale 0
											// mientras que a sea mayor o igual a 10
											// imprime el valor de a
											// aumentale al valor de a 2 veces
			System.out.println(a);
	}

}
