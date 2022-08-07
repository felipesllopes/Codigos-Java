package TratandoErros;

import BancoStylus.CriandoException;

public interface Excecoes {

	public static void cpf(String cpf) {
		if (cpf.length() != 11) {
			throw new RuntimeException("CPF inválido!");
		}
	}

	public static void criacaoConta(int agencia, int conta) throws CriandoException {
		if ((agencia < 100 || agencia > 999) || (conta < 1000 || conta > 99999)) {
			throw new CriandoException("Número de agência ou de conta inválido!");
		}
	}

}
