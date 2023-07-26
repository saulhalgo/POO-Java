package ClasesAbstractas;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado() {
		super();
	}

	public Cuadrado(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
	
		double resultado = lado * lado;
		return resultado;
	}

}
