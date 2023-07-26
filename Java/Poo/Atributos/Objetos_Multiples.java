//Si crea varios objetos de una clase, puede cambiar los valores del atributo en un objeto, sin afectar los valores de atributo en el otro:
package Atributos;

public class Objetos_Multiples {
	int x = 1;

	public static void main(String[] args) {
		Objetos_Multiples valor1 = new Objetos_Multiples();
		Objetos_Multiples vlor2 = new Objetos_Multiples();
		valor1.x = 101;
		vlor2.x = 504;
		System.out.println(valor1.x);
		System.out.println(vlor2.x);
		//Se crean dos objetos y pueden acceder a los argumentos y darles valores diferentes 
	}

}
