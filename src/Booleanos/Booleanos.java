/*Muy a menudo, en la programación, necesitará un tipo de datos que solo puede tener uno de dos valores, como:   
SÍ / NO
ENCENDIDO / APAGADO
VERDADERO / FALSO  */

package Booleanos;

public class Booleanos {
	public static void main(String[] args) {
		// Para estos casos se usa un tipo de dato boolean con valores de "True y False"

		boolean javaEsDivertido = true;
		boolean laCebollaEsRica = false;

		System.out.println(javaEsDivertido);
		System.out.println(laCebollaEsRica);
		// Es mas comun devolver valores booleanos que introducirlos esto para "Condiciones"

		int x = 150;
		int y = 325;
		System.out.println(x > y); // -----> Estamos preguntando que si 150 es mayor a 325

	}

}
