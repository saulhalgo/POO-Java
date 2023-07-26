package Metodos;

public class Llamar_Metodo {
	static void miMetodo() {
		System.out.println("Este es un metodo");
		// Se crea el metodo
	}
	// Para poder llamar al metodo tenemos que asegurarnos estar fuera de las llaves
	// respectivas del metodo

	public static void main(String[] args) {
		miMetodo();
		miMetodo();
		miMetodo();
		// Se llama al metodo y se puede hacer las veces que sea
	}
}
