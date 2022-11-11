package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import contrato.Contrato;
import servico.Paypal;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/mm/aaaa): ");
		LocalDate data = LocalDate.parse(sc.next(), dtf);

		Contrato contrato = new Contrato(numero, data, new Paypal());

		System.out.print("Valor de contrato: ");
		double valor = sc.nextDouble();
		System.out.print("Parcelas: ");
		int parcelas = sc.nextInt();

		contrato.realizarContrato(valor, parcelas);

		System.out.println();
		contrato.getListaParcelas().forEach(par -> System.out.println(par));

		System.out.println();
		System.out.println(contrato.valorTotalContrato());

		sc.close();
	}

}
