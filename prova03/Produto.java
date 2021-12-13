package prova03;
//ex1
public class Produto implements ItemOrcamento{
	String descricao;
	int quantidade;
	double valorUnitario;

	public Produto(String descricao, double valorUnitario, int quantidade) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	@Override
	public String getDescricao(String descricao) {
		this.descricao = descricao;
		return descricao;
	}

	@Override
	public double getValor(double valor) {
		valor = quantidade * valorUnitario;
		return valor;
	}

}
