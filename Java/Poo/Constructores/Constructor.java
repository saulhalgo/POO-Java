//Un constructor en Java es un metodo especial que se usa para inicializar objetos.
package Constructores;

public class Constructor {
	int x; // Atributo de la clase 
	
	//Se crea una clase constructor de la clase "Constrcutor"
	public Constructor(){ //El nombre del constructor tiene que ser igual al nombre de la clase y no puede tener un tipo de retorno como (void) 
		x=5; //Se inicializa el valor del atributo x de la clase constructor 
	}
	public static void main(String[] args) {
		Constructor miObjeto = new Constructor();//La clase va a llamar al constructor 
		System.out.println(miObjeto.x);
	}
}
