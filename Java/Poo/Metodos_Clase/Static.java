//Para acceder a un metodo " static " no es necesario crear un objeto
package Metodos_Clase;

public class Static {
	static void metodo () {
		System.out.println("Hola Mundo");
	}
	public static void main(String[] args) {
		metodo();
		//Accedemos al metodo dentro de la clase static sin crear un objeto 
	}
}
