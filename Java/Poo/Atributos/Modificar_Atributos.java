//Modifica el atributo apartir de un objeto creado 
package Atributos;

public class Modificar_Atributos {
	int x ; 
	
	public static void main(String[] args) {
		Modificar_Atributos objetoModificador = new Modificar_Atributos();
		
		objetoModificador.x = 40;
		//Se usa el objeto y se accede al atributo y se le da el nuevo valor 
		System.out.println(objetoModificador.x);
		//El atributo de la clase Modificar_Atributos ahora vale " 40 "
	}
	
}
