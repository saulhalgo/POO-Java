package Metodos;

public class Recursividad {

	static int Recu(int x) {

		if (x > 0) {
			return x + Recu(x - 1);

		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		int resultado = Recu(10);
		System.out.println(resultado);
	}
}