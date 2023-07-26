/*En java esta permitido cambiar varibles 
  solo que se tiene que tener cuidado 
  ya que la variable que se cambie tendra ese valor 
  y sustuira al valor principal*/
package Variables;

public class CambiarVariable {
	public static void main(String[] args) {
		int miNumero = 15;
		// Se le dio el valor de 15
		miNumero = 23; // -------> no se le pone el tipo de dato
		// Ahora miNumero es 23
		System.out.println(miNumero);
	}

}
