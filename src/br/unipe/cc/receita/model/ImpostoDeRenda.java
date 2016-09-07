package br.unipe.cc.receita.model;

public class ImpostoDeRenda extends Imposto implements ITributavel {

	public ImpostoDeRenda(double valor, int ano, int codImposto, String tipo) {
		super(valor, ano, codImposto, tipo);
	}

	public double calcularImposto() {
		return valor * 0.27;
	}

}
