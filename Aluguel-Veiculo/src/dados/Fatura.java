package dados;

public class Fatura {

	private double pagamentoBasico;
	private double taxa;

	public Fatura(double pagamentoBasico, double taxa) {
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}

	public double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public double getTaxa() {
		return taxa;
	}

	public double pagamentoTotal() {
		return getPagamentoBasico() + getTaxa();
	}
}
