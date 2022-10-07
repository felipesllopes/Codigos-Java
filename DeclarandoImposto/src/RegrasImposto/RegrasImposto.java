package RegrasImposto;

public class RegrasImposto {

	/**
	 * A pessoa f�sica que possuir uma renda anual superior a R$20.000,00 pagar� 15%
	 * do valor em imposto
	 * 
	 * @return
	 */
	public double rendaSuperior() {
		return 0.15;
	}

	/**
	 * A pessoa f�sica que possuir uma renda anual inferior a R$20.000,00 pagar� 5%
	 * do valor em imposto
	 * 
	 * @return
	 */
	public double rendaInferior() {
		return 0.05;
	}

	/**
	 * A pessoa f�sica que possuir algum valor em exames acrescentados ao imposto,
	 * receber� 50% do valor em desconto.
	 * 
	 * @return
	 */
	public double descontoGastoSaude() {
		return 0.50;
	}

	/**
	 * Pessoa jur�dica que possuir mais de 10 funcion�rios, pagar� 7% do sal�rio
	 * anual em imposto.
	 * 
	 * @return
	 */
	public double funcSuperior() {
		return 0.07;
	}

	/**
	 * Pessoa jur�dica que possuir 10 funcion�rios ou menos, pagar� 9% do sal�rio
	 * anual em imposto.
	 * 
	 * @return
	 */
	public double funcInferior() {
		return 0.09;
	}
}
