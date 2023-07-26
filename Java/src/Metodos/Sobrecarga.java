//Varios metodos pueden tener diferentes parametros 
package Metodos;

public class Sobrecarga {
	/*
	 * static int metodoEntero(int x, int y) { 
	 * return x + y; 
	 * } 
	 * static double metodoDoble(double x, double y) { 
	 * return x + y;
	 * } 
	 * public static void main(String[] args) { 
	 * int numero1= metodoEntero(10, 10);
	 * double numero2 = metodoDoble(2.5, 2.5); 
	 * System.out.println(numero1);
	 * System.out.println(numero2);
	 * .. }
	 */
	// Seria la forma tradicional de sumar dos numeros con diferente parametro

	static int plusMetodo(int x, int y) {
		return x + y;
	}

	static double plusMetodo(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int numero = plusMetodo(15, 15);
		double numero2 = plusMetodo(2.5, 2.5);
		System.out.println("int: " + numero);
		System.out.println("Double: " + numero2);
	}

}
