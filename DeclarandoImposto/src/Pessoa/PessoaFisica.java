package Pessoa;

import RegrasImposto.RegrasImposto;

public class PessoaFisica extends Pessoa {

	private double gastosSaude;
	RegrasImposto ri = new RegrasImposto();

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	@Override
	public double imposto() {
		if (getRendaAnual() < 20000) {
			return Math.abs((getRendaAnual() * ri.rendaInferior()) - (gastosSaude * ri.descontoGastoSaude()));
		} else {
			return Math.abs((getRendaAnual() * ri.rendaSuperior()) - (gastosSaude * ri.descontoGastoSaude()));
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", Gastos: R$" + String.format("%.2f", gastosSaude) + ", Imposto devido: R$"
				+ String.format("%.2f", imposto());
	}

}
