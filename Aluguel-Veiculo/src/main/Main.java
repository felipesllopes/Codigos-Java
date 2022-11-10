package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import dados.DataAluguel;
import dados.Veiculo;
import servico.ServicoAluguel;
import servico.TaxaServico;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		try {
			System.out.println("Entre com os dados do aluguel");
			System.out.print("Modelo do carro: ");
			String modelo = sc.nextLine();
			System.out.print("Retirada (dd/mm/aaaa hh:mm): ");
			LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), dtf);
			System.out.print("Entrega (dd/mm/aaaa hh:mm): ");
			LocalDateTime entrega = LocalDateTime.parse(sc.nextLine(), dtf);

			DataAluguel dtAluguel = new DataAluguel(retirada, entrega, new Veiculo(modelo));

			System.out.print("Entre com o preço por hora: R$");
			double precoPorHora = sc.nextDouble();
			System.out.print("Entre com o preço por dia: R$");
			double precoPorDia = sc.nextDouble();

			ServicoAluguel svAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new TaxaServico());

			svAluguel.processarFatura(dtAluguel);

			System.out.println("\nFATURA");
			System.out.printf("Pagamento básico: R$%.2f\n", dtAluguel.getFatura().getPagamentoBasico());
			System.out.printf("Imposto: R$%.2f\n", dtAluguel.getFatura().getTaxa());
			System.out.printf("Pagamento total: R$%.2f\n", dtAluguel.getFatura().pagamentoTotal());
		} catch (RuntimeException e) {
			System.out.println("\n" + e.getMessage());
		}

		sc.close();
	}

}
