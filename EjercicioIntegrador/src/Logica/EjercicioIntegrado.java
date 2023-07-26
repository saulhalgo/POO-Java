package Logica;

public class EjercicioIntegrado {
	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu( 55,  "pikachu", 5.5,  "masculino",  5,  "electrico");
		System.out.println("EL numero de pokedex es: " + pikachu.getNumPokedex());
		System.out.println("EL nombre del pokemon es: " + pikachu.getNombrePokemon());
		System.out.println("EL peso del pokemon es de: " + pikachu.getPesoPokemon());
		System.out.println("EL sexo del pokemon es: " + pikachu.getSexo());
		System.out.println("La temporada en la que aparece es: " + pikachu.getTemporadaQueAparece());
		System.out.println("El pokemon es de tipo : " + pikachu.getTipo());
		pikachu.AtacarAraniaso();

	}
}
