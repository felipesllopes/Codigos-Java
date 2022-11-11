package contrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {

	private LocalDate data;
	private double valor;

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Parcelas(LocalDate data, double valor) {
		this.data = data;
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return data.format(dtf) + " - R$" + String.format("%.2f", valor);
	}
}
