
/*Crea una aplicacion donde ingreses el tamaño 
 * de una escalera por teclado y se imprima una 
 * escalera de asteriscos 
 */

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese es tamaño de la escalera");
		int valor = sc.nextInt();

		for (int i = 0; i < valor; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}