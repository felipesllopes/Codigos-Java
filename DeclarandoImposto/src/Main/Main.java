package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pessoa.Pessoa;
import Pessoa.PessoaFisica;
import Pessoa.PessoaJuridica;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();

		System.out.print("Quantas pessoas irá adicionar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + "ª Pessoa: ");
			System.out.print("Pessoa física ou jurídica? (f/j): ");
			char tipo = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: R$");
			double rendaAnual = sc.nextDouble();

			if (tipo == 'f') {
				System.out.print("Gastos com saúde: R$");
				double gastosSaude = sc.nextDouble();
				Pessoa fisica = new PessoaFisica(nome, rendaAnual, gastosSaude);
				lista.add(fisica);

			} else if (tipo == 'j') {
				System.out.print("Número de funcionários: ");
				int numFuncionarios = sc.nextInt();
				Pessoa juridica = new PessoaJuridica(nome, rendaAnual, numFuncionarios);
				lista.add(juridica);
			}
		}

		System.out.println("\n\nPESSOAS");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}

		sc.close();
	}
}
