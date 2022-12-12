package Calculadora2;

import java.util.ArrayList;

public class Calculator {
	
	private ArrayList<Double> operands = new ArrayList<Double>();
	private ArrayList<String> operators = new ArrayList<String>();
	
	private double resultado = 0;
	
	public Calculator() {
		
	}
	

	public void performOperation(double operand) {
		operands.add(operand);
	}
	
	
	public void performOperation(String operator) {
		double parcial = 0;
		
		if(operator != "=") {
			this.operators.add(operator);
		}
		else {
			int i = 0;
	
			this.resultado = this.operands.get(0);
				

			for(i = 0; i < this.operators.size(); i++) {
				if(this.operators.get(i) == "*") {
					parcial=this.resultado * this.operands.get(i + 1);
				}
				if(this.operators.get(i) == "/") {
					parcial=this.resultado / this.operands.get(i + 1);
				}
				if(this.operators.get(i) == "+") {
					parcial=this.resultado += this.operands.get(i + 1);
				}				
				else if(this.operators.get(i) == "-") {
					parcial -= this.operands.get(i + 1);
				}
			}
				this.resultado = parcial;
		}
	}
	
	
	
	public void getResults() {		
		System.out.println("Resultado = "+this.resultado);
	}



}
