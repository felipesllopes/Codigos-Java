package main;

import java.util.Scanner;

import classe.Aluno;
import classe.Aula;
import classe.Curso;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do instrutor: ");
		String instrutor = sc.nextLine();
		System.out.print("Nome do curso: ");
		String nomeCurso = sc.nextLine();
		Curso curso = new Curso(instrutor, nomeCurso);

		System.out.print("Quantas aulas o curso possui? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "ª aula:");
			System.out.print("Título da aula: ");
			sc.nextLine();
			String nomeAula = sc.nextLine();
			System.out.print("Duração da aula: ");
			int tempoAula = sc.nextInt();
			curso.adicionarAula(new Aula(nomeAula, tempoAula));
		}

		System.out.print("Quantos alunos o curso possui? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "º aluno:");
			System.out.print("Escreva o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Matrícula: ");
			int matricula = sc.nextInt();
			curso.matricularAluno(new Aluno(nome, matricula));
		}

		System.out.println(curso);
		System.out.println("--------------------------------------------------------------------");

		curso.getAula().forEach(aul -> System.out.println(aul));
		System.out.println("--------------------------------------------------------------------");

		curso.getAluno().forEach(alu -> System.out.println(alu));

		sc.close();
	}

}
