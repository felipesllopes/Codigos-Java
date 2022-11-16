package entidades;

public class Times implements Comparable<Times> {

	private int posicao;
	private String clube;
	private String pais;
	private String confederacao;
	private double pontos;

	public Times(int posicao, String clube, String pais, String confederacao, double pontos) {
		this.posicao = posicao;
		this.clube = clube;
		this.pais = pais;
		this.confederacao = confederacao;
		this.pontos = pontos;
	}

	public int getPosicao() {
		return posicao;
	}

	public String getClube() {
		return clube;
	}

	public String getPais() {
		return pais;
	}

	public String getConfederacao() {
		return confederacao;
	}

	public double getPontos() {
		return pontos;
	}

	// classificando por ordem alfabetica
//	@Override
//	public int compareTo(Times o) {
//		return clube.compareTo(o.clube);
//	}

	// classificando por posição em ordem decrescente
//	@Override
//	public int compareTo(Times o) {
//		return -(posicao - o.posicao);
//	}

	// classificando por pontos
	@Override
	public int compareTo(Times o) {
		return (int) -(pontos - o.pontos);
	}

	@Override
	public String toString() {
		return posicao + " | " + clube + " | " + pais + " | " + confederacao + " | " + pontos + " pts";
	}

}