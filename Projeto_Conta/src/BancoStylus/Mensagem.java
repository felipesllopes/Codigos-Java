package BancoStylus;

import java.time.LocalDate;

/**
 * Interface que contem as informações contidas em todas as operações.
 * @author Felipe
 *
 */
public interface Mensagem {

	public static String informacoesBancarias(Cliente cliente, int agencia, int conta) {
		return "___________________________________________________________________________________________\n\n"
				+ cliente.getNome() + ", Bem-vindo(a) ao nosso banco!\n" + "CPF: " + cliente.getCpf() + ", Profissão: "
				+ cliente.getprofissao() + ", Agência: " + agencia + ", Número: " + conta
				+ "\n___________________________________________________________________________________________\n";
	}

	public static String depositoAprovado(double valor, Cliente cliente, double saldo) {
		return "--------------------------------------------------------------------\n" + "Depósito de R$"
				+ String.format("%.2f", valor) + " realizado com sucesso de "
				+ cliente.getNome() + ". Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String depositoNegado(double valor, Cliente cliente, double saldo) {
		return "--------------------------------------------------------------------\n"
				+ cliente.getNome() + ", seu saldo é insuficiente para depósito!\n"
				+ "Valor de depósito R$" + String.format("%.2f", valor) + ". Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String saqueAprovado(Cliente cliente, double valor, double saldo) {
		return "--------------------------------------------------------------------\n"
				+ cliente.getNome() + ", saque realizado com sucesso!\n"
				+ "Valor de saque R$" + String.format("%.2f", valor) + ". Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String saqueNegado(Cliente cliente, double valor, double saldo) {
		return "--------------------------------------------------------------------\n"
				+ cliente.getNome() + ", seu saldo é insuficiente para saque!\n"
				+ "Valor de saque R$" + String.format("%.2f", valor) +  ". Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String transferenciaAprovada(Cliente cliente, double valor, BancoStylus destino, double saldo) {
		return "--------------------------------------------------------------------\n" 
				+ cliente.getNome() + ", transferência de R$" + String.format("%.2f", valor) 
				+ " realizada com sucesso para " + destino.getCliente().getNome() 
				+ ". Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String trasferenciaNegada(Cliente cliente, double saldo) {
		return "--------------------------------------------------------------------\n" 
				+ cliente.getNome() + ", seu saldo é insuficiente para transferência! " 
				+ "Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String extratoBancario(Cliente cliente, double saldo) {
		return "-------------------------------------------------------------\n" + cliente.getNome()
				+ ", seu saldo é de: R$" + String.format("%.2f\n", saldo) + LocalDate.now()
				+ "\n-------------------------------------------------------------";
	}

	/**
	 * Não é permitido usar valor negativo.
	 */
	public static String valorNegativo() {
		return "Valor incorreto!";
	}

	/**
	 * Depósito em Conta Poupança permitido somente a partir de R$20,00.
	 * 
	 * @return
	 */
	public static String regraDeposito() {
		return "Não pode ser depositado valor abaixo de R$" + String.format("%.2f", RegrasDeNegocio.valorDeposito())
				+ ".\n";
	}
	
	/**
	 * Transferencia em final de semana não é permitido em nossa empresa, devido o alto número de golpes aplicados em clientes.
	 * @return
	 */
	public static String diaTransferencia() {
		return "Infelizmente o serviço de transferência está indisponível temporariamente. Tente novamente a partir de segunda-feira.\n";
	}

}
