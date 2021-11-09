package lista02;

public class FichaEstabelecimento {
    /*
     * Escreva uma classe para representar a ficha de uma pessoa num estabelecimento
     * comercial, para registrar compras “a crédito”, também conhecido como “fiado”.
     * Cada ficha contém o nome, CPF e o telefone do cliente, um limite de crédito e
     * o saldo atual. Deve ser possível lançar o valor de compras “a crédito” e
     * registrar os pagamentos. Compras serão aceitas somente até atingir o valor do
     * limite de crédito. Pode haver pagamento “a maior”, quando uma pessoa que deve
     * X paga um valor maior que X, sem receber o troco. Neste caso, o valor pago a
     * mais será descontado nas próximas compras. Escreva a classe acima, com
     * construtores que permitam criar Fichas apenas com os dados da pessoa, ou
     * então com os dados e um valor de uma compra inicial. O programa deverá testar
     * vários tipos de lançamentos (tanto compras como pagamentos) e mostrar o
     * estado final da(s) conta(s) utilizadas como exemplo.
     */
    String nome;
    String cpf;
    String telefone;
    float limiteCredito;
    float saldoAtual;

    public FichaEstabelecimento(String nome, String cpf, String telefone, float limiteCredito, float saldoAtual) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.limiteCredito = limiteCredito;
        this.saldoAtual = saldoAtual;
    }

    // Não deixa fazer fiado caso salto atual seja maior ou igual ao limite.
    public static float fiado(float valor, FichaEstabelecimento fiadoConta) {
        if (fiadoConta.limiteCredito <= fiadoConta.saldoAtual) {
            return fiadoConta.saldoAtual;
        } else {
            return fiadoConta.saldoAtual = fiadoConta.saldoAtual + valor;
        }
    }

    // método valor pago na ficha.
    public static void valorPago(float valor, FichaEstabelecimento ficha) {
        ficha.saldoAtual = ficha.saldoAtual - valor;
        float newValor = valor - ficha.saldoAtual;

        if (ficha.saldoAtual < 0) {
            ficha.limiteCredito = ficha.limiteCredito + newValor;
            ficha.saldoAtual = 0;
        } else {
            ficha.limiteCredito = ficha.limiteCredito;
        }
    }

    static void fichaConta(float valor, FichaEstabelecimento fichaPessoa) {
        valorPago(valor, fichaPessoa);
        fiado(valor, fichaPessoa);

    }
}
