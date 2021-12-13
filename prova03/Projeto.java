package prova03;

import java.util.*;

public class Projeto {
	String titulo;
	Date inicio;
	double valor;
	Participacao partipacao;
	List<Participacao> listaParticipacao;
	
	public Projeto(String titulo, Date inicio, double valor, Participacao partipacao, List<Participacao> listaParticipacao) {
		this.titulo = titulo;
		this.inicio = inicio;
		this.valor = valor;
		this.partipacao = partipacao;
		this.listaParticipacao = listaParticipacao;
	}

	public double calcularCusto() {
		double totalCustos = this.partipacao.horas * this.partipacao.programador.valorHora;
		return totalCustos;
	}

}
