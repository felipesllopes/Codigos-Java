package BancoStylus;

import java.time.LocalDate;

/**
 * Interface que contem as informa��es contidas em todas as opera��es.
 * @author Felipe
 *
 */
public interface Mensagem {

	public static String informacoesBancarias(Cliente cliente, int agencia, int conta) {
		return "___________________________________________________________________________________________\n\n"
				+ cliente.getNome() + ", Bem-vindo(a) ao nosso banco!\n" + "CPF: " + cliente.getCpf() + ", Profiss�o: "
				+ cliente.getprofissao() + ", Ag�ncia: " + agencia + ", N�mero: " + conta
				+ "\n___________________________________________________________________________________________\n";
	}

	public static String depositoAprovado(double valor, Cliente cliente, double saldo) {
		return "--------------------------------------------------------------------\n" + "Dep�sito de R$"
				+ String.format("%.2f", valor) + " realizado com sucesso de "
				+ cliente.getNome() + ". Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String depositoNegado(double valor, Cliente cliente, double saldo) {
		return "--------------------------------------------------------------------\n"
				+ cliente.getNome() + ", seu saldo � insuficiente para dep�sito!\n"
				+ "Valor de dep�sito R$" + String.format("%.2f", valor) + ". Saldo atual R$" + String.format("%.2f", saldo)
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
				+ cliente.getNome() + ", seu saldo � insuficiente para saque!\n"
				+ "Valor de saque R$" + String.format("%.2f", valor) +  ". Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String transferenciaAprovada(Cliente cliente, double valor, BancoStylus destino, double saldo) {
		return "--------------------------------------------------------------------\n" 
				+ cliente.getNome() + ", transfer�ncia de R$" + String.format("%.2f", valor) 
				+ " realizada com sucesso para " + destino.getCliente().getNome() 
				+ ". Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String trasferenciaNegada(Cliente cliente, double saldo) {
		return "--------------------------------------------------------------------\n" 
				+ cliente.getNome() + ", seu saldo � insuficiente para transfer�ncia! " 
				+ "Saldo atual R$" + String.format("%.2f", saldo)
				+ "\n--------------------------------------------------------------------\n";
	}

	public static String extratoBancario(Cliente cliente, double saldo) {
		return "-------------------------------------------------------------\n" + cliente.getNome()
				+ ", seu saldo � de: R$" + String.format("%.2f\n", saldo) + LocalDate.now()
				+ "\n-------------------------------------------------------------";
	}

	/**
	 * N�o � permitido usar valor negativo.
	 */
	public static String valorNegativo() {
		return "Valor incorreto!";
	}

	/**
	 * Dep�sito em Conta Poupan�a permitido somente a partir de R$20,00.
	 * 
	 * @return
	 */
	public static String regraDeposito() {
		return "N�o pode ser depositado valor abaixo de R$" + String.format("%.2f", RegrasDeNegocio.valorDeposito())
				+ ".\n";
	}
	
	/**
	 * Transferencia em final de semana n�o � permitido em nossa empresa, devido o alto n�mero de golpes aplicados em clientes.
	 * @return
	 */
	public static String diaTransferencia() {
		return "Infelizmente o servi�o de transfer�ncia est� indispon�vel temporariamente. Tente novamente a partir de segunda-feira.\n";
	}

}
