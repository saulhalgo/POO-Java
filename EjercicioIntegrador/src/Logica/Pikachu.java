package Logica;

public class Pikachu extends Pokemon implements IElectrico{
	

	public Pikachu(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaQueAparece,
			String tipo) {
		super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacarPlacaje() {
	System.out.println("Hola soy pikachu y mi ataque es placaje");
		
	}

	@Override
	public void AtacarAraniaso() {
		System.out.println("Hola soy pikachu y mi ataque es araniaso");
		
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Hola soy pikachu y mi ataque es mordisco");
		
	}

	@Override
	public void atacarImpatrueno() {
		System.out.println("Hola soy pikachu y mi ataque es impatrueno");
		
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Hola soy pikachu y mi ataque es puño de trueno");
		
	}

	@Override
	public void atacarRayo() {
		System.out.println("Hola soy pikachu y mi ataque es ataque de rayo ");
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Hola soy pikachu y mi ataque es ataque de carga");
		
	}

}
