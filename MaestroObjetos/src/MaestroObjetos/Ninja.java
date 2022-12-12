package MaestroObjetos;


public class Ninja extends Human{
	public Ninja() {
		stealth = 10;
	}
	
	public void steal(Human hum) {
		hum.health -= this.stealth;
		this.health += this.stealth;
	}

	public void runAway() {
		this.health -= 10;
	}

}