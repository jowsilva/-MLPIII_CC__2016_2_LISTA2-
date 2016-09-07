package br.unipe.cc.receita.model;

public class ImpostoPublico extends Imposto implements ITributavel {

	public ImpostoPublico(double valor, int ano, int codImposto, String tipo) {
		super(valor, ano, codImposto, tipo);
	}

	public double calcularImposto() {
		return valor * 0.15;
	}

}
