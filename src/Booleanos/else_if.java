//Utilice la else if declaraci�n para especificar una nueva condici�n si la primera condici�n es false.
package Booleanos;

public class else_if {
	public static void main(String[] args) {
		int tiempo = 22;
		if (tiempo < 10) { // -----> Se que esta condicion no es verdadera
			System.out.println("Buenos Dias");
		} else if (tiempo < 20) { // ------> Uso una nueva condicion pero tampoco esverdadera
			System.out.println("Buen dia");
		} else { // ------> Se ejecuta este ultimo codigo
			System.out.println("Buenas Tardes ");
		}
	}
}
