package Metodos;

public class Parametros {
	static void miMetodo(String nombres) { // ------> dentro de los parametros se ponen los tipos de datos que se quiere
		System.out.println("Su nombre es " + nombres);// ----->se le dice que imprima "Su nombre es + el nombre
		// miMetodo es el nombre del metodo
		// String es el parametros
		// Saul , Juan Pancho se les va a llamar argumentos

	}

	public static void main(String[] args) {
		miMetodo("saul");
		miMetodo("Juan");
		miMetodo("Pancho");
		// -----> la funcion de los metodos es volver a usar el codigo y no repetirlo 3
		// veces

		String nombre1 = "Saul";
		String nombre2 = "Juan";
		String nombre3 = "Pancho";
		System.out.println("Su nombre es" + nombre1);
		System.out.println("Su nombre es" + nombre2);
		System.out.println("Su nombre es" + nombre3);
		// En lugar de hacer esto 3 veces se crea el metodo para volver a usar el codigo

	}
}
