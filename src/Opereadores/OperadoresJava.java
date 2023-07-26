//Los operadores se utilizan para realizar operaciones en variables y valores.
package Opereadores;

public class OperadoresJava {
	public static void main(String[] args) {
		// operador "+" para sumar valores
		int x = 100 + 50;

		// también se puede usar para sumar una variable y un valor, o una variable y otra variable
		int sum1 = 100 + 50;// ------> valor y valor
		int sum2 = sum1 + 150;// ----> valor y variable
		int sum3 = sum2 + sum2;// ---> variable y variable
		System.out.println(x);
		System.out.println(sum3);

	}

}
