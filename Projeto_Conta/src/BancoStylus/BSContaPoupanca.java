package BancoStylus;

import java.time.DayOfWeek;

public class BSContaPoupanca extends BancoStylus implements Mensagem {

	/**
	 * Para cada nova Conta Poupança criada há um bônus de regra da empresa.
	 * @param agencia
	 * @param numero
	 * @throws CriandoException
	 */
	public BSContaPoupanca(int agencia, int numero) throws CriandoException {
		super(agencia, numero);
		super.saldo += RegrasDeNegocio.bonusConta();
	}

	/**
	 * Método para depósito. Não há regra aplicada no momento.
	 */
	@Override
	public String deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return Mensagem.depositoAprovado(valor, cliente, saldo);
		} else {
			return Mensagem.valorNegativo();
		}
	}

	/**
	 * Respeitando a regra da empresa, será cobrado 1% do valor transferido para
	 * quem estiver realizando a transferencia.
	 * Não é permitido realizar transferência aos finais de semana.
	 */
	@Override
	public String transfere(double valor, BancoStylus destino) {
		/**
		 * Juros recebe o valor inteiro + juros. Sem necessidade de chamar o método para
		 * realizar o calculo. 
		 */
		double juros = RegrasDeNegocio.regraTransferencia(valor);

		if (saldo >= juros && valor > 0) {
			if (diaSemana != DayOfWeek.SATURDAY && diaSemana != DayOfWeek.SUNDAY) {
				this.saldo -= juros;
				destino.saldo += valor;
				return Mensagem.transferenciaAprovada(cliente, valor, destino, saldo);
			} else {
				return Mensagem.diaTransferencia();
			}
		} else {
			return Mensagem.trasferenciaNegada(cliente, saldo);
		}
	}

}
