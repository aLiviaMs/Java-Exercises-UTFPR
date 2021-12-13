package prova03;
//ex2
import java.util.*;

public class Participacao {
	public double horas;
	Date inicio;
	String atribuicao;
	Projeto projeto;
	Programador programador;
	
	public Participacao(double horas, Date inicio, String atribuicao, Programador programador, Projeto projeto) {
		this.horas = horas;
		this.inicio = inicio;
		this.atribuicao = atribuicao;
		this.programador = programador;
		this.projeto = projeto;
	}

}
