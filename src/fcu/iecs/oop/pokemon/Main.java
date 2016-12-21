package fcu.iecs.oop.pokemon;

public class Main {

	public static void main(String[] args) {
	    Psyduck psyduck = new Psyduck("My First Psyduck", 100, PokemonType.WATER);
	    psyduck.attack();
	    Charmander charmander = new Charmander("My First Charmander", 456, PokemonType.FIRE);
	    charmander.attack();
	    Bulbasaur bulbasaur = new Bulbasaur("My First Bulbasaur", 589, PokemonType.GRASS);
	    bulbasaur.attack();

	  }


}
