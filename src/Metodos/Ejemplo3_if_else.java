//Ejemplo con if else 
package Metodos;

//Programa que define si eres mayor de edad 
public class Ejemplo3_if_else {
	static void Acceso(int edad) { // -----> no queremos que nos retorne ningun valor por eso se usa void
		if (edad < 18) {
			System.out.println("Usted aun es menor de edad");
		} else {
			System.out.println("Usted puede pasar ");
		}
	}

	// Recordemos que si no retornamos ningun valor no ponemos return
	public static void main(String[] args) {
		Acceso(20);
	}

}
