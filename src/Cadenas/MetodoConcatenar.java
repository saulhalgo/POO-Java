/*Como en el ejercicio anterior de "Concatenar cadenas"
  vamos a hacer el mismo ejercicio solo que aplicaremos 
  un metodo de las cadenas*/
package Cadenas;

public class MetodoConcatenar {
	public static void main(String[] args) {
		// El metodo empleado se llama concat()
		String firtsName = "Saul ";// ------> Agregar espacio ya que el metodo no lo agrega
		String lastName = "Hidalgo";
		System.out.println(firtsName.concat(lastName));
		// En el parametro se pone el otro valor que se desea concatenar

		// Bonus Insertar comillas en una cadena imprimida con \*

		String nombre = "Saul ";
		String escuela = "Fes Aragon";

		System.out.println(nombre + "estudia la carrera de \"Inegieria en Computación\" en " + escuela);

	}

}
