//Se pueden tener tantos parametros como se quieran 
package Constructores;

public class Parametros2 {
	int modeloA�o;
	String modeloNombre;
	
	public Parametros2(int a�o , String modelo) {
		modeloA�o = a�o;
		modeloNombre = modelo;
	}
	public static void main(String[] args) {
		Parametros2 objeto = new Parametros2(2022, "bochito");
		System.out.println(objeto.modeloA�o + " "+ objeto.modeloNombre);
		
	}
}
