//El siguiente ejemplo utiliza el número del día de la semana para calcular el nombre del día de la semana:
package Switch;

public class Ejercicio_Switch {
	public static void main(String[] args) {
		/*
		 * La semana tiene 7 dias y dependiendo del numero que elijamos se escribira en
		 * pantalla en nombre del dia
		 */

		int dia = 5;

		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Ingrese un dia correcto de la semana ");
			// El caso de delfault se usa si el valor no se encuentra en ninguno de los
			// otros 7 casos
		}

	}

}
