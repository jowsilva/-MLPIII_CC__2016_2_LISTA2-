package br.unipe.cc.receita.model;

public class ImpostoPrivado extends Imposto implements ITributavel {

	public ImpostoPrivado(double valor, int ano, int codImposto, String tipo) {
		super(valor, ano, codImposto, tipo);
	}

	public double calcularImposto() {
		return valor * 0.10;
	}

}
