package BancoStylus;

public interface RegrasDeNegocio {
	
	/**
	 * Todo cliente que abre uma Conta Poupan�a recebe um bonus que atualmente � de R$50.
	 * @return
	 */
	public static double bonusConta() {
		return 50.0;
	}
	
	/**
	 * Dep�sito permitido somente a partir de R$20,00. Regra para Conta Corrente.
	 * @return
	 */
	public static double valorDeposito() {
		return 20.0;
	}
	
	/**
	 * Juros de 1% cobrado por transfer�ncia em Conta Poupan�a
	 * @param saldo
	 * @return
	 */
	public static double regraTransferencia(double valor) {
		return valor * (0.01 + 1);
	}

	
}
