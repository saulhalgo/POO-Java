/*Si no se quiere que se modifique el valor uno mismo o otra persona   
 colocar "final" al inicio  ya que volvera la variable una constante 
  lo que significa que no se va a poder cambiar*/
package Variables;

public class VariableFinal {
	public static void main(String[] args) {
		final int numero = 15;
		// numero = 20; ------> Se intenta cambiar el valor de la variable numero de 15 a 20
		System.out.println(numero);
		// No dejara imprimirlo ya que el ID reconoce el problema y imprime el valor de 15
	}

}
