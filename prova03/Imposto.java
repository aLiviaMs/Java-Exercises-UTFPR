package prova03;
//ex1
public class Imposto implements ItemOrcamento{
	String fatoGerador;
	double baseCalculo;
	double aliquota;
	
	public Imposto(String fatoGerador, double baseCalculo, double aliquota) {
		this.fatoGerador = fatoGerador;
		this.baseCalculo = baseCalculo;
		this.aliquota = aliquota;
	}

	@Override
	public String getDescricao(String descricao) {
		descricao = fatoGerador;
		return descricao;
	}

	@Override
	public double getValor(double valor) {
		aliquota = aliquota / 100;
		valor = aliquota * baseCalculo;
		return valor;
	}
	
}
