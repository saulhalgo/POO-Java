/*En algunas veces se va a tener que declarar muchas variable
  y vermos como hacerlo de diferentes formas*/
package Variables;

public class DeclararMuchasVariables {
	public static void main(String[] args) {
		// Muchas variables de un solo tipo se usa con una ,
		// Que no hacer
		int x = 5;
		int y = 6;
		int z = 50;
		System.out.println(x + y + z);

		// Lo que se tiene que hacer
		// Ahorra tiempo
		int a = 5, b = 6, c = 50;
		System.out.println(a + b + c);
		// Ya no se tiene que volver a poner el tipo de Variable
	}

}
