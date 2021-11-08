package lista02;

public class Data {
    int dia;
    int mes;
    int ano;

    // constructor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatarData() {
        String result = this.dia + "/" + this.mes + "/" + this.ano;
        return result;
    }

}

class newClassEx2 extends Data {
    public newClassEx2(int dia, int mes, int ano) {
        super(dia, mes, ano);
    }

    public static void main(String[] args) {
        Data data = new Data(30, 12, 2021);
        System.out.println(data.formatarData());
    }
}
