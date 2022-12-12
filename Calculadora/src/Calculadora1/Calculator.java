package Calculadora1;

public class Calculator {
	private double OperandOne;
	private double OperandTwo;
	private char Operation;
	

	public Calculator() {
		
	}
	
	public Calculator(double operandOne, double operandTwo, char operation) {
		OperandOne = operandOne;
		OperandTwo = operandTwo;
		Operation = operation;
	}

	public double getOperandOne() {
		return OperandOne;
	}

	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}

	public double getOperandTwo() {
		return OperandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}

	public char getOperation() {
		return Operation;
	}

	public void setOperation(char operation) {
		Operation = operation;
	}


public double performOperation() {
	if(this.getOperation() == '+') {
		return this.getOperandOne() + this.OperandTwo;		
	}
	else if(this.getOperation() == '-') {
		return this.getOperandOne() - this.OperandTwo;		
	}
	else {
		System.out.println("No se puede realizar el calculo");
		return 0;
	}
}


public void getResults() {
	System.out.println("Resultado de "+this.OperandOne+" "+this.Operation+" "+this.OperandTwo+ " = "+this.performOperation());
}


}


