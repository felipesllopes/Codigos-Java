package classe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String instrutor;
	private String nomeCurso;
	private List<Aluno> aluno = new ArrayList<>();
	private List<Aula> aula = new ArrayList<>();
	private double tempoTotal;

	public Curso(String instrutor, String nomeCurso) {
		this.instrutor = instrutor;
		this.nomeCurso = nomeCurso;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public List<Aluno> getAluno() {
		return Collections.unmodifiableList(aluno);
	}

	public List<Aula> getAula() {
		return Collections.unmodifiableList(aula);
	}

	public void adicionarAula(Aula aula) {
		this.aula.add(aula);
		this.tempoTotal += aula.getTempoAula();
	}

	public void matricularAluno(Aluno aluno) {
		this.aluno.add(aluno);
	}

	public double getTempoTotal() {
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "\nCurso: " + nomeCurso
				+ "\nInstrutor: " + instrutor 
				+ "\nTempo de aula: " + tempoTotal + " min";
	}
}
