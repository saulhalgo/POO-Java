//Los constructores tambi�n pueden tomar par�metros, que se utilizan para inicializar atributos.
package Constructores;

public class Parametros {
	int x;
	
	public Parametros(int y) {
		x=y;
	}
	public static void main(String[] args) {
		Parametros miObjeto = new Parametros(5);
		System.out.println(miObjeto.x);
		
	}
}
