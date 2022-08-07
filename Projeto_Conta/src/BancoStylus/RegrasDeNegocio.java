package BancoStylus;

public interface RegrasDeNegocio {
	
	/**
	 * Todo cliente que abre uma Conta Poupança recebe um bonus que atualmente é de R$50.
	 * @return
	 */
	public static double bonusConta() {
		return 50.0;
	}
	
	/**
	 * Depósito permitido somente a partir de R$20,00. Regra para Conta Corrente.
	 * @return
	 */
	public static double valorDeposito() {
		return 20.0;
	}
	
	/**
	 * Juros de 1% cobrado por transferência em Conta Poupança
	 * @param saldo
	 * @return
	 */
	public static double regraTransferencia(double valor) {
		return valor * (0.01 + 1);
	}

	
}
