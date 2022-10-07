package Pessoa;

public abstract class Pessoa {
	
	private String nome;
	private double rendaAnual;
	
	public Pessoa(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getRendaAnual() {
		return rendaAnual;
	}
	
	public abstract double imposto();
	
	@Override
	public String toString() {
		return nome + ", Renda anual: R$" + String.format("%.2f", rendaAnual);
	}
}
