//Sirve para simplificar codigo 
package Booleanos;

public class operadorTernario {
	public static void main(String[] args) {
		int tiempo = 20;
		if (tiempo > 18) {
			System.out.println("Buenos Dias");
		} else {
			System.out.println("Buenas Tardes ");
		}

		// Codigo Simplificado
		int tiempo1 = 20;
		String resultado = (tiempo1 > 18) ? "Buen dia" : "Buenas tardes";
		System.out.println(resultado);
	}
}
