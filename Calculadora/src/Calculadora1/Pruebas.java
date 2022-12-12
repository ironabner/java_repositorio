package Calculadora1;

public class Pruebas{

	public static void main(String[] args) {
		Calculator suma = new Calculator();

		suma.setOperandOne(10.5);
		suma.setOperation('+');
		suma.setOperandTwo(5.2);
		
		suma.performOperation();
		suma.getResults();
		
		
	}

}
