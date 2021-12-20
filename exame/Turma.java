package exame1;
//ex3
public class Turma {
	int numAlunos;
	Curso curso;
	Professor professor;
	
	public Turma(int numAlunos, Curso curso, Professor professor) {
		this.numAlunos = numAlunos;
		this.curso = curso;
		this.professor = professor;
	}
	
	double calcularCusto() {
		return professor.remuneracao() + curso.valorManutencao;
	}
}
