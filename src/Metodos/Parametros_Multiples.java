//Se puden poner tantos parametos como se quiera 
package Metodos;

public class Parametros_Multiples {
	static void miMetodo(String nombre, int edad) {
		System.out.println("Su nombre es " + nombre + " y su edad es de " + edad + " a�os");
	}

	public static void main(String[] args) {
		miMetodo("Saul", 22);
		miMetodo("Pancho", 33);
		miMetodo("Gaby", 15);

		/*
		 * Tenga en cuenta que cuando trabaja con varios par�metros, la llamada al
		 * m�todo debe tener la misma cantidad de argumentos que par�metros, y los
		 * argumentos deben pasarse en el mismo orden.
		 */
	}
}
