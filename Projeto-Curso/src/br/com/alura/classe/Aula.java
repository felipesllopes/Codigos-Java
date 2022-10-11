package br.com.alura.classe;

public class Aula {

	private String nomeAula;
	private int tempoAula;

	public Aula(String nomeAula, int tempoAula) {
		this.nomeAula = nomeAula;
		this.tempoAula = tempoAula;
	}

	public String getNomeAula() {
		return nomeAula;
	}

	public int getTempoAula() {
		return tempoAula;
	}

	@Override
	public String toString() {
		return nomeAula + ", " + tempoAula + " min";
	}
}
