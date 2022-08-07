package Teste;

import java.util.Scanner;

import BancoStylus.BSContaCorrente;
import BancoStylus.BSContaPoupanca;
import BancoStylus.Cliente;
import BancoStylus.CriandoException;

public class Main2 {

	public static void main(String[] args) throws CriandoException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número da Agência: (Agência deve conter de 3 a 4 dígitos) \n>> ");
		int agencia = sc.nextInt();
		System.out.print("Digite o número da Conta: (Conta deve conter de 4 a 5 dígitos) \n>> ");
		int conta = sc.nextInt();

		BSContaCorrente cc = new BSContaCorrente(agencia, conta);
		System.out.println("------------------------------------------------ ");
		sc.nextLine();

		System.out.print("Nome do cliente: \n>> ");
		String nome = sc.nextLine();
		System.out.print("CPF: \n>> ");
		String cpf = sc.nextLine();
		System.out.print("Profissão: \n>> ");
		String profissao = sc.nextLine();

		Cliente cliente = new Cliente(nome, cpf, profissao);

		System.out.println(cc.vincularConta(cliente));

		System.out.print("Digite o valor do depósito: \n>> R$");
		int valor = sc.nextInt();
		System.out.println(cc.deposita(valor));

//		BSContaPoupanca cp = new BSContaPoupanca(123, 1234);
//		Cliente cliente2 = new Cliente("Guilherme", "12333456652", "DBA");
//		System.out.println(cp.vincularConta(cliente2));
//		cp.deposita(400);
//		
//		System.out.println(cp.transfere(200, cc));
//		
//		System.out.println(cc.extrato());
//		System.out.println(cp.extrato());

		sc.close();
	}
}
