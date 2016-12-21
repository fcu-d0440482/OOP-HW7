package fcu.iecs.oop.pokemon;

public abstract class Pokemon {

	private int cp;
	private String name;
	private PokemonType type;

	public void Pokemon(String name, int cp, PokemonType type) {
		this.cp = cp;
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public PokemonType getType() {
		return type;
	}

	public int getcp() {
		return cp;
	}

	public void setcp(int cp) {
		this.cp = this.cp + cp;
	}

	public abstract void attack();

}
