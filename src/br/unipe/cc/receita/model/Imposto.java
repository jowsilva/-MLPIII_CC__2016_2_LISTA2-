package br.unipe.cc.receita.model;

public abstract class Imposto {

	protected double valor;
	protected int ano;
	protected int codImposto;
	protected String tipo;
	protected double total;

	public Imposto(double valor, int ano, int codImposto, String tipo) {

		this.valor = valor;
		this.ano = ano;
		this.codImposto = codImposto;
		this.tipo = tipo;		

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getCodImposto() {
		return codImposto;
	}

	public void setCodImposto(int codImposto) {
		this.codImposto = codImposto;
	}

}
