package BancoStylus;

import java.time.DayOfWeek;

public class BSContaCorrente extends BancoStylus implements RegrasDeNegocio {

	public BSContaCorrente(int agencia, int conta) throws CriandoException {
		super(agencia, conta);
	}

	/**
	 * Método para deposito. Deve respeitar a regra de negócio.
	 */
	@Override
	public String deposita(double valor) {
		if (valor >= RegrasDeNegocio.valorDeposito()) {
			this.saldo += valor;
			return Mensagem.depositoAprovado(valor, cliente, saldo);
		} else {
			return Mensagem.regraDeposito();
		}
	}

	/**
	 * Método de saque. Não há regra aplicada no momento.
	 * 
	 * @param valor
	 */
	public String saca(double valor) {
		if (saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return Mensagem.saqueAprovado(cliente, valor, saldo);
		} else {
			return Mensagem.saqueNegado(cliente, valor, saldo);
		}
	}

	/**
	 * Método de transferência. Não há regra aplicada no momento.
	 * Não é permitido realizar transferência aos finais de semana.
	 */
	@Override
	public String transfere(double valor, BancoStylus destino) {
		if (saldo >= valor && valor > 0) {
			if (diaSemana != DayOfWeek.SATURDAY && diaSemana != DayOfWeek.SUNDAY) {
				this.saldo -= valor;
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
