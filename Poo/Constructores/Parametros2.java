//Se pueden tener tantos parametros como se quieran 
package Constructores;

public class Parametros2 {
	int modeloAño;
	String modeloNombre;
	
	public Parametros2(int año , String modelo) {
		modeloAño = año;
		modeloNombre = modelo;
	}
	public static void main(String[] args) {
		Parametros2 objeto = new Parametros2(2022, "bochito");
		System.out.println(objeto.modeloAño + " "+ objeto.modeloNombre);
		
	}
}
