package br.com.impacta.exercicio4;

public class Sisifo extends Pessoa{
	private double forca;
	
	@Override
	public void empurrarPedra() {
		System.out.println("Override do metodo de Empurrar Pedra da Classe Pessoa");
	}

	public double getForca() {
		return forca;
	}

	public void setForca(double forca) {
		this.forca = forca;
	}

	
	
}
