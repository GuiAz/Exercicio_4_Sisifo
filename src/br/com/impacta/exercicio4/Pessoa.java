package br.com.impacta.exercicio4;

public class Pessoa {
	private String nome;
	private int idade;
	
	public void empurrarPedra() {
		
	}
	
	//EXEMPLOS DE ENCAPSULAMENTO: GETTERS E SETTERS, PARA QUE OS ATRIBUTOS SEJAM PRIVADOS MAS ACESSIVEIS.
	//PROTEGENDO A INTEGRIDADE DO OBJETO.
	public synchronized String getNome() {
		return nome;
	}

	public synchronized void setNome(String nome) {
		this.nome = nome;
	}

	public synchronized int getIdade() {
		return idade;
	}

	public synchronized void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
