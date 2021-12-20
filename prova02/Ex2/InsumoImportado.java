package prova02.Ex2;

public class InsumoImportado extends Insumo {
    static double COTACAO_DOLAR;
    double taxaImportacao;
    String paisOrigem;

    public InsumoImportado(int cod, String descr, double taxaImp, double preco, String pais) {
        super(cod, descr, preco);
        this.codigo = cod;
        this.descricao = descr;
        this.preco = preco;
        this.paisOrigem = pais;
        this.taxaImportacao = taxaImp;
    }

    public static double setCotacaoDolar(double valor) {
        COTACAO_DOLAR = valor;
        return valor;
    }

    public double calcularImpostos() {
        double impostoImportacao = (this.preco * COTACAO_DOLAR);
        double impostoICMS = (this.preco * 0.08);
        double totalImposto = impostoImportacao + impostoICMS;
        return totalImposto;
    }

    public double calcularCustoTotal() {
        return (this.preco + calcularImpostos()) * COTACAO_DOLAR;
    }

}
