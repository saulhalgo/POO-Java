//Se puede cambiar el valor de un atributo mediante un objeto
package Atributos;

public class Cambiar_Atributos {
   int x = 5; 
   
   public static void main(String[] args) {
	Cambiar_Atributos nuevoValor = new Cambiar_Atributos();
	nuevoValor.x = 40;
	System.out.println(nuevoValor.x);
	//Mediante el objeto "nuevoValor" se accede al atributo  de la clase "Cambiar_Atributos" y se le da el valor de " 40 "
}
}
