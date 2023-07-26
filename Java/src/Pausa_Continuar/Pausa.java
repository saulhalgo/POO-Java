package Pausa_Continuar;

public class Pausa {
	public static void main(String[] args) {
		// Se usa la sentencia "break" para pausar el ciclo en 4

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 4) {
				break;
			}
		}

	}
}
