package br.unipe.cc.receita.ui;

import br.unipe.cc.receita.model.ImpostoDeRenda;
import br.unipe.cc.receita.model.ImpostoPrivado;
import br.unipe.cc.receita.model.ImpostoPublico;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		ImpostoDeRenda renda = new ImpostoDeRenda(1000, 2016, 1, "Imposto de Renda Federal");
		ImpostoPrivado privado = new ImpostoPrivado(1000, 2016, 2, "Imposto Particular Estadual");
		ImpostoPublico publico = new ImpostoPublico(1000, 2016, 3, "Imposto Público Municipal");

		System.out.println("COD             TIPO              BASE       IMPOSTO");
		System.out.println(" " + renda.getCodImposto() + "  " + renda.getTipo() + "     " + renda.getValor() + "       "
				+ renda.calcularImposto());
		System.out.println(" " + privado.getCodImposto() + "  " + privado.getTipo() + "  " + privado.getValor()
				+ "       " + privado.calcularImposto());
		System.out.println(" " + publico.getCodImposto() + "  " + publico.getTipo() + "    " + publico.getValor()
				+ "       " + publico.calcularImposto());

	}
}
