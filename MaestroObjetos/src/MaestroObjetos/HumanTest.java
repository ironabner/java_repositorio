package MaestroObjetos;

import MaestroObjetos.Human;
import MaestroObjetos.Ninja;
import MaestroObjetos.Samurai;
import MaestroObjetos.Wizard;



public class HumanTest {

	public static void main(String[] args) {

		
		Human hum1 = new Human();
		
		hum1.Resumen();
		
		Wizard wizard1 = new Wizard();
		Ninja ninja1 = new Ninja();
		Samurai samurai1 = new Samurai();
		
		
		wizard1.Resumen();
		ninja1.Resumen();
		samurai1.Resumen();
		
		
		System.out.println("Numero de Samurais Actuales : " +samurai1.howMany());
	}

}