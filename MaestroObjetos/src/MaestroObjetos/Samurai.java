package MaestroObjetos;

public class Samurai extends Human{
	protected static int contador = 0;


	public Samurai() {
		health = 200;
		contador++;
	}
	
	
	public void meditate() {
		
		this.health += this.health/2;
	}
	
	public void deathBlow(Human hum) {
		hum.health = 0;
		this.health /= 2;
	}
	
	public int howMany() {
		return contador;
	}

}
