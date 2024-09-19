package br.com.impacta.exercicio4;

public class Monte {
	private double altura;
	private String dificuldade;
	
	public void atingirTopo() {
		System.out.println("Topo foi Atingido");
	}
	
	//EXEMPLOS DE ENCAPSULAMENTO: GETTERS E SETTERS, PARA QUE OS ATRIBUTOS SEJAM PRIVADOS MAS ACESSIVEIS.
	//PROTEGENDO A INTEGRIDADE DO OBJETO.
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	
	
}
