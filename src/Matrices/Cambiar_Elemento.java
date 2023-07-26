//Para cambiar el valor de un elemento específico, consulte el número de la variable 
package Matrices;

public class Cambiar_Elemento {
	public static void main(String[] args) {
		String[] carros1 = { "Volvo", "BMW", "Ford", "Mazda" };

		carros1[0] = "Opel";
		System.out.println(carros1[0]);

		// Recordar que los indices de las matrices empiezan desde 0
	}
}
