package Metodos_Clase;

public class Metodos_Acceso {//-----> Clase

	public void gas() {//------> Metodo 
		System.out.println("El carro va tan rapido como puede ");

	}
	public void veloz(int maximaVelocidad) {//------->Metodo
		System.out.println("La velocidad maxima de carro es de "+ maximaVelocidad);
	}
		public static void main(String[] args) {//----->Metodo main 
			Metodos_Acceso miCarro = new Metodos_Acceso();
			miCarro.gas();
			miCarro.veloz(500);
		}
	}
	

