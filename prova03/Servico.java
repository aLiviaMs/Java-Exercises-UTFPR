package prova03;
//ex1
public class Servico implements ItemOrcamento{
	String nomePrestador;
	int horas;
	double valorHora;

	public Servico(String nomePrestador, int horas, double valorHora) {
		this.nomePrestador = nomePrestador;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	@Override
	public String getDescricao(String descricao) {
		descricao = "Servico de " +  nomePrestador;
		return descricao;
	}

	@Override
	public double getValor(double valor) {
		valor = horas * valorHora;
		return valor;
	}
	
}
