package br.com.impacta.exercicio4;


	//EXEMPLO DE HERANCA DA CLASSE PESSOA, PARA QUE POSSAMOS ACESSAR SEUS ATRIBUTOS E METODOS.
	//UTIL PARA QUANDO UMA CLASSE CONTEM OS ATRIBUTOS E METODOS QUE SAO GLOBAIS E REUTILIZAVEIS PARA 
	//DIVERSAS OUTRAS CLASSES.
public class Sisifo extends Pessoa{
	private double forca;
	
	
	
	//EXEMPLO DE POLIMORFISMO: BUSCAMOS O METODO empurrarPedra DA CLASSE 'PESSOA', E ALTERAMOS.
	//ESSA ALTERACAO FAZ COM QUE O METODO FUNCIONE DE MANEIRA PONTUAL PARA DETERMINADOS MOMENTOS.
	@Override
	public void empurrarPedra() {
		System.out.println("Override do metodo de Empurrar Pedra da Classe Pessoa");
	}
	
	
	//EXEMPLOS DE ENCAPSULAMENTO: GETTERS E SETTERS, PARA QUE OS ATRIBUTOS SEJAM PRIVADOS MAS ACESSIVEIS.
	//PROTEGENDO A INTEGRIDADE DO OBJETO.
	public double getForca() {
		return forca;
	}

	public void setForca(double forca) {
		this.forca = forca;
	}

	
	
}
