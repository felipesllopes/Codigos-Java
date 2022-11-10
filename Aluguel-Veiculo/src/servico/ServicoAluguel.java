package servico;

import java.time.Duration;

import dados.DataAluguel;
import dados.Fatura;

public class ServicoAluguel {

	private double precoPorHora;
	private double precoPorDia;
	private TaxaServico taxaServico;

	public ServicoAluguel(double precoPorHora, double precoPorDia, TaxaServico taxaServico) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaServico = taxaServico;
	}

	public void processarFatura(DataAluguel dataAluguel) {

		/**
		 * O valor deve ser retornado em minutos, para que após a divisão tenha-se o valor em decimal.
		 * Utilizando o método ceil() o valor será arredondado para cima.
		 * Ex: 70/60 = 1,666667 ~~ 2 horas
		 */
		double minutos = Duration.between(dataAluguel.getRetirada(), dataAluguel.getEntrega()).toMinutes();
		double horas = minutos / 60;

		double pagamentoBasico;

		if (horas < 12) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		} else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
		}

		double taxa = taxaServico.taxa(pagamentoBasico);

		dataAluguel.gerarFatura(new Fatura(pagamentoBasico, taxa));

	}

}
