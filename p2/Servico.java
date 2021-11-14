public class Servico {
    String descricao;
    int tempoContratado;
    int tempoTrabalhado;
    double precoHora;
    double taxaHoraAdicional;
    boolean ativo = true;

    public Servico(String descricao, int tempo, double precoHora, double taxaExtra) {
        this.descricao = descricao;
        this.tempoContratado = tempo;
        this.precoHora = precoHora;
        this.taxaHoraAdicional = taxaExtra;
    }

    public double registrar(int horas) {
        this.tempoTrabalhado = horas;
        boolean isAtivo = this.ativo;

        if (isAtivo == false)
            return 0;
        else {
            if (this.tempoContratado <= 0 || this.precoHora <= 0 || this.taxaHoraAdicional <= 0) {
                return 0;
            } else if (this.tempoContratado - this.tempoTrabalhado <= 0) {
                int tempoExtra = this.tempoTrabalhado - this.tempoContratado;
                return ((this.tempoTrabalhado - tempoExtra) * this.precoHora)
                        + (tempoExtra * (this.precoHora + this.taxaHoraAdicional));
            } else {
                return (this.tempoTrabalhado * this.precoHora);
            }
        }
    }

    public int getSaldoHoras() {
        boolean isAtivo = this.ativo;
        if (isAtivo == false)
            return 0;
        else {
            if (this.tempoContratado <= 0 || this.precoHora <= 0 || this.taxaHoraAdicional <= 0) {
                return 0;
            } else
                return this.tempoContratado = this.tempoContratado - this.tempoTrabalhado;
        }
    }

    public void encerrar() {
        this.ativo = false;
    }

    public static void main(String[] args) {
        System.out.println(
                "RETORNOS IGUAIS A ZERO PODEM SIGNIFICAR: -O método encerrar foi chamado. \n Os valores passados que possuem indice <= 0 dados como inválidos.");

        Servico prog = new Servico("Desenvolvimento App", 200, 275.00, 45.50);
        double vlr = prog.registrar(120);

        System.out.println(prog.descricao);
        System.out.println("valor1: " + vlr);

        int resta = prog.getSaldoHoras();
        System.out.println("resta1: " + resta);

        vlr = prog.registrar(110);
        System.out.println("valor2: " + vlr);

        resta = prog.getSaldoHoras();
        System.out.println("resta2: " + resta);

        prog.encerrar();

        resta = prog.getSaldoHoras();
        vlr = prog.registrar(120);
        System.out.println(resta);
        System.out.println(vlr);

    }
}