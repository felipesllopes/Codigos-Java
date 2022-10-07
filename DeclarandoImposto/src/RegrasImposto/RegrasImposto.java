package RegrasImposto;

public class RegrasImposto {

	/**
	 * A pessoa física que possuir uma renda anual superior a R$20.000,00 pagará 15%
	 * do valor em imposto
	 * 
	 * @return
	 */
	public double rendaSuperior() {
		return 0.15;
	}

	/**
	 * A pessoa física que possuir uma renda anual inferior a R$20.000,00 pagará 5%
	 * do valor em imposto
	 * 
	 * @return
	 */
	public double rendaInferior() {
		return 0.05;
	}

	/**
	 * A pessoa física que possuir algum valor em exames acrescentados ao imposto,
	 * receberá 50% do valor em desconto.
	 * 
	 * @return
	 */
	public double descontoGastoSaude() {
		return 0.50;
	}

	/**
	 * Pessoa jurídica que possuir mais de 10 funcionários, pagará 7% do salário
	 * anual em imposto.
	 * 
	 * @return
	 */
	public double funcSuperior() {
		return 0.07;
	}

	/**
	 * Pessoa jurídica que possuir 10 funcionários ou menos, pagará 9% do salário
	 * anual em imposto.
	 * 
	 * @return
	 */
	public double funcInferior() {
		return 0.09;
	}
}
