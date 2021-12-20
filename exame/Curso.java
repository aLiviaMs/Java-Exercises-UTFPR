package exame1;

import java.util.List;

//ex3
public class Curso {
	int duracao;
	double valorManutencao;
	List<Turma> listaTurma;
	
	public Curso(int duracao, List<Turma> listaTurma, double valorManutencao) {
		this.duracao = duracao;
		this.valorManutencao = valorManutencao;
		this.listaTurma = listaTurma;
	}
}
