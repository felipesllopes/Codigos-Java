package BancoStylus;

import TratandoErros.Excecoes;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		Excecoes.cpf(cpf);
		this.profissao = profissao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getprofissao() {
		return profissao;
	}
	
	@Override
	public String toString() {
		return nome + ", " + cpf + ", " + profissao;
	}
}
