package servico;

public class Paypal implements ServicoOnline {

	@Override
	public double juros(double valor, int mes) {
		return valor * (mes / 100.0);
	}

	@Override
	public double taxa(double valor) {
		return valor * 0.02;
	}

}
