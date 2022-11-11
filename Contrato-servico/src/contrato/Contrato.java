package contrato;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import servico.ServicoOnline;

public class Contrato {

	private int numContrato;
	private LocalDate data;
	private ServicoOnline servicoOnline;
	private double valorTotal;

	List<Parcelas> listaParcelas = new ArrayList<>();

	public Contrato(int numContrato, LocalDate data, ServicoOnline servicoOnline) {
		super();
		this.numContrato = numContrato;
		this.data = data;
		this.servicoOnline = servicoOnline;
	}

	public int getNumContrato() {
		return numContrato;
	}

	public LocalDate getData() {
		return data;
	}

	public List<Parcelas> getListaParcelas() {
		return listaParcelas;
	}

	public ServicoOnline getServicoOnline() {
		return servicoOnline;
	}

	private double getValorTotal() {
		return valorTotal;
	}

	public String valorTotalContrato() {
		return "Valor total do contrato: R$" + String.format("%.2f", getValorTotal());
	}

	public void realizarContrato(double valor, int parcelas) {

		double valorParcelado = valor / parcelas;

		for (int i = 1; i <= parcelas; i++) {

			LocalDate parcelaMeses = data.plusMonths(i);

			double juros = servicoOnline.juros(valorParcelado, i);
			double taxa = servicoOnline.taxa(valorParcelado + juros);
			double valorTotal = valorParcelado + juros + taxa;

			listaParcelas.add(new Parcelas(parcelaMeses, valorTotal));
			this.valorTotal += valorTotal;
		}
	}
}
