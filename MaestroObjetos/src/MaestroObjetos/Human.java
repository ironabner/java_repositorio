package MaestroObjetos;

public class Human {
	
	public String nombre;
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;	
	
	
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}
	


	public int getStrength() {
		System.out.println("Fuerza " + this.strength);
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		System.out.println("Inteligencia " + this.intelligence);
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		System.out.println("Sigilo " + this.stealth);
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		System.out.println("Salud " + this.health);
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void ataque(Human hum) {
		hum.health -= this.strength;
	}
	
	public void Resumen() {
		System.out.println("Fuerza  " + this.strength);
		System.out.println("Inteligencia  " + this.intelligence);
		System.out.println("Sigilo  " + this.stealth);
		System.out.println("Salud  " + this.health);
	}
	
	
	
	

}