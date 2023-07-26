
package Metodos;

public class Valores_Devueltos {
	// Si se quiere devolver un valor se usa un tipo de dato (int, char, etc...)

	static int miMetodo(int x) {// -----> se ponen los parametros normalmente

		// Se sustituye el void por el dato del parametro ya que void no regresa ningun
		// valor

		return 5 + x;// -------> dependiendo del dato ingresado que lo sume con 5
	}

	public static void main(String[] args) {

		System.out.println(miMetodo(5));
	}
}
