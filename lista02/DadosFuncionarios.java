package lista02;

import java.util.Scanner;

public class DadosFuncionarios {

    int numMatricula;
    String nome;
    String setor;
    float salarioAtual;

    public DadosFuncionarios(int matricula, String nome, String setor, float salarioAtual) {
        this.numMatricula = matricula;
        this.nome = nome;
        this.setor = setor;
        this.salarioAtual = salarioAtual;
    }

    public static float reajusteSalario(DadosFuncionarios funcionario) {
        float porcentagemReajuste = 0, salarioAjustado;
        float salario = funcionario.salarioAtual;
        String setor = funcionario.setor;

        if (salario < 2500) {
            if (setor.equals("a"))
                porcentagemReajuste = (float) 8 / 100;
            if (setor.equals("b"))
                porcentagemReajuste = (float) 10 / 100;
            if (setor.equals("c"))
                porcentagemReajuste = (float) 11 / 100;
            if (setor.equals("d"))
                porcentagemReajuste = (float) 12 / 100;
        }
        if (salario >= 2500 && salario < 5000) {
            if (setor.equals("a"))
                porcentagemReajuste = (float) 7 / 100;
            if (setor.equals("b"))
                porcentagemReajuste = (float) 9 / 100;
            if (setor.equals("c"))
                porcentagemReajuste = (float) 10 / 100;
            if (setor.equals("d"))
                porcentagemReajuste = (float) 11 / 100;
        }
        if (salario >= 5000) {
            if (setor.equals("a"))
                porcentagemReajuste = (float) 6 / 100;
            if (setor.equals("b"))
                porcentagemReajuste = (float) 8 / 100;
            if (setor.equals("c") || setor.equals("d"))
                porcentagemReajuste = (float) 9 / 100;
        }

        salarioAjustado = (float) (salario - (salario * porcentagemReajuste));

        return salarioAjustado;
    }

    public static void main(String[] args) {
        float[] salarios = new float[3];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int matricula;
            float salarioAtual;
            String nome, setor;

            System.out.println("Digite, respectivamete: numero matricula, nome, seto e salario atual");

            matricula = scn.nextInt();
            nome = scn.next();
            setor = scn.next();
            salarioAtual = scn.nextFloat();

            DadosFuncionarios funcionario = new DadosFuncionarios(matricula, nome, setor, salarioAtual);

            salarios[i] = reajusteSalario(funcionario);
        }

        // TERMINAR ESSA ULTIMA PARTE DE DECRESCENTE.
        for (int i = 2; i >= 0; i--) {
            System.out.println(salarios[i]);
        }

        scn.close();
    }
}
