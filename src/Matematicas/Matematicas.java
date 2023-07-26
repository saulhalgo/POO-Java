
//La clase Java Math tiene muchos métodos que le permiten realizar tareas matemáticas con números.
package Matematicas;

public class Matematicas {
	public static void main(String[] args) {
		// El método se puede utilizar para encontrar el valor más alto de x o y con el metodo Math.max(x,y)
		int num1 = 535;
		int num2 = 343;
		System.out.println(Math.max(num2, num1)); // ----> Se pueden poner los parametros o utilizar las variables

		// El método se puede utilizar para encontrar el valor más bajo de x o y Math.min(x,y)
		System.out.println(Math.min(111, 33));

		// El método devuelve la raíz cuadrada de x Math.sqrt(x)
		System.out.println(Math.sqrt(64));

		// Math.random()devuelve un número aleatorio entre 0,0 incluyendolo y el 1.0  excluyendolo
		System.out.println(Math.random());

		// Para obtener un mayor control sobre el número aleatorio, por ejemplo, solo
		// desea un número aleatorio entre 0 y 100, puede usar la siguiente fórmula:

		int randomNum = (int) (Math.random() * 101);
		System.out.println(randomNum);
	}
}
