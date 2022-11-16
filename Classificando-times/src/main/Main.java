package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Times;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Times> lista = new ArrayList<>();
		
		// ***OBS: DEVE-SE VERIFICAR O ENDEREÇO DO ARQUIVO***
		String path = "C:\\Program Files\\Java\\Projetos\\Classificando-times\\times.txt";

		BufferedReader br = new BufferedReader(new FileReader(path));

		String linha = br.readLine();
		while (linha != null) {
			String[] coluna = linha.split(",");
			lista.add(new Times(Integer.parseInt(coluna[0]), coluna[1], coluna[2], coluna[3],Double.parseDouble(coluna[4])));
			linha = br.readLine();
		}

		Collections.sort(lista);
		System.out.println("Posição - Clube - País - Confederação - Pontos");
		System.out.println("--------------------------------------------------");
		for (Times t : lista) {
			System.out.println(t);
		}

		br.close();
	}
}