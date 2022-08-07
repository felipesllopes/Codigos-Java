package Teste;

import BancoStylus.BSContaCorrente;
import BancoStylus.BSContaPoupanca;
import BancoStylus.Cliente;
import BancoStylus.CriandoException;

public class Main {

	public static void main(String[] args) throws CriandoException {

		BSContaPoupanca cp = new BSContaPoupanca(391, 3201);
		Cliente cbs1 = new Cliente("Felipe Silva", "12345678910", "Programador");
		System.out.println(cp.vincularConta(cbs1));
		
		System.out.println(cp.deposita(100));
		System.out.println(cp.extrato());
		

		BSContaCorrente cc = new BSContaCorrente(344, 3244);
		Cliente cbs2 = new Cliente("Alex Cardoso", "10987654321", "Design");
		System.out.println(cc.vincularConta(cbs2));
		
		System.out.println(cc.deposita(200));
		System.out.println(cc.transfere(130, cc));
		
	}

}
