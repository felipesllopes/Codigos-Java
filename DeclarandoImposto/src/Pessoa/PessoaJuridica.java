package Pessoa;

import RegrasImposto.RegrasImposto;

public class PessoaJuridica extends Pessoa {

	private int numFuncionarios;
	RegrasImposto ri = new RegrasImposto();

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	@Override
	public double imposto() {
		if (numFuncionarios <= 10) {
			return getRendaAnual() * ri.funcInferior();
		} else {
			return getRendaAnual() * ri.funcSuperior();
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", Número de funcionários: " + numFuncionarios + ", Imposto indevido: R$"
				+ String.format("%.2f", imposto());
	}

}
