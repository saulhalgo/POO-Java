//Se pueden agregar tantos atributos como se quiera 
package Atributos;

public class Atributos_Multiples {
	String nombre = "Saul";
	char PrimeraLetra = 'S';
	int edad = 22;
	
	public static void main(String[] args) {
		Atributos_Multiples hombre = new Atributos_Multiples();
		System.out.println("Nombre:"+ hombre.nombre);
		System.out.println("Primer Letra del Nombre:"+ hombre.PrimeraLetra);
		System.out.println("Edad:"+ hombre.edad);
	}
}
