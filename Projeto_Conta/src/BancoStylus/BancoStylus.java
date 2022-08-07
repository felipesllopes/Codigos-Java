package BancoStylus;

import java.time.DayOfWeek;
import java.time.LocalDate;

import TratandoErros.Excecoes;

public abstract class BancoStylus implements RegrasDeNegocio {

	LocalDate data = LocalDate.of(2022, 8, 7);
	DayOfWeek diaSemana = data.getDayOfWeek();

	protected Cliente cliente;
	private int agencia;
	private int conta;
	protected double saldo;

	public BancoStylus(int agencia, int conta) throws CriandoException {
		this.agencia = agencia;
		this.conta = conta;
		Excecoes.criacaoConta(agencia, conta);
	}

	public abstract String deposita(double valor);

	/**
	 * Só existe o método para sacar na Conta Corrente.
	 * 
	 * @param valor
	 * @param destino
	 */
//	public String saca(double valor) {
//		if (saldo >= valor && valor > 0) {
//			this.saldo -= valor;
//			return Mensagem.saqueAprovado(cliente, valor, saldo);
//		} else {
//			return Mensagem.saqueNegado(cliente, valor, saldo);
//		}
//	}

	public abstract String transfere(double valor, BancoStylus destino);

	public String extrato() {
		return Mensagem.extratoBancario(cliente, saldo);
	}

	/**
	 * Método para vincular a Conta criada ao Cliente.
	 * 
	 * @param cliente
	 */
	public String vincularConta(Cliente cliente) {
		this.cliente = cliente;
		return Mensagem.informacoesBancarias(cliente, agencia, conta);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

}
