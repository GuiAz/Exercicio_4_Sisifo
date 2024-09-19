package br.com.impacta.exercicio4;

public class Pedra {
	
	private double peso;
	
	public void rolar() {
		System.out.println("Rolando");
	}
	
	//EXEMPLOS DE ENCAPSULAMENTO: GETTERS E SETTERS, PARA QUE OS ATRIBUTOS SEJAM PRIVADOS MAS ACESSIVEIS.
	//PROTEGENDO A INTEGRIDADE DO OBJETO.
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
