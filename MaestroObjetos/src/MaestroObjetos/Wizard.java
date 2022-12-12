package MaestroObjetos;


public class Wizard extends Human{	
	public Wizard() {
	
		health = 50;
		intelligence = 8;
		
	}
	
	
	public void heal(Human hum) {
		
		hum.health += this.intelligence;
	}
	
	public void fireball(Human hum) {
		
		hum.health -= (this.intelligence * 3);
	}

}
