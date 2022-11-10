package servico;

/**
 * A taxa de 20% � para pagamento b�sico abaixo de R$100; A taxa de 15% � para
 * pagamento b�sico acima de R$100
 * @author Felipe
 */
public class TaxaServico {

	public double taxa(double pagamentoBasico) {
		if (pagamentoBasico <= 100) {
			return pagamentoBasico * 0.2;
		} else {
			return pagamentoBasico * 0.15;
		}
	}
}
