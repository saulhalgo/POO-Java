//Para acceder al metodo de la clase se necesita crear un objeto
package Metodos_Clase;

public class Public {
	public void metodo () {
		System.out.println("Hola Mundo");
	}
	public static void main(String[] args) {
		Public acceder = new Public();
		acceder.metodo();
		
	}
}
