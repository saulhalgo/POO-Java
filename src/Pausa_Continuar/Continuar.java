//La instruccion "continue" interrumpe el bucle y si se cumple la condicion continua con la interaccion en el bucle
package Pausa_Continuar;

public class Continuar {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 4) {
				continue;
			}
		}

	}
}
