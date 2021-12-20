package exame1;

import java.util.List;

//ex3
public class Professor {
	double valorHora;
	Curso curso;
	List<Turma> listaTurma;
	
	public Professor(double valorHora, List<Turma> listaTurma) {
		this.valorHora = valorHora;
		this.listaTurma = listaTurma;
	}
	
	double remuneracao() {
		return curso.duracao * this.valorHora;
	}
}
