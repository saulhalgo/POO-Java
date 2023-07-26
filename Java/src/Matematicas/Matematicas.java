
//La clase Java Math tiene muchos m�todos que le permiten realizar tareas matem�ticas con n�meros.
package Matematicas;

public class Matematicas {
	public static void main(String[] args) {
		// El m�todo se puede utilizar para encontrar el valor m�s alto de x o y con el metodo Math.max(x,y)
		int num1 = 535;
		int num2 = 343;
		System.out.println(Math.max(num2, num1)); // ----> Se pueden poner los parametros o utilizar las variables

		// El m�todo se puede utilizar para encontrar el valor m�s bajo de x o y Math.min(x,y)
		System.out.println(Math.min(111, 33));

		// El m�todo devuelve la ra�z cuadrada de x Math.sqrt(x)
		System.out.println(Math.sqrt(64));

		// Math.random()devuelve un n�mero aleatorio entre 0,0 incluyendolo y el 1.0  excluyendolo
		System.out.println(Math.random());

		// Para obtener un mayor control sobre el n�mero aleatorio, por ejemplo, solo
		// desea un n�mero aleatorio entre 0 y 100, puede usar la siguiente f�rmula:

		int randomNum = (int) (Math.random() * 101);
		System.out.println(randomNum);
	}
}
