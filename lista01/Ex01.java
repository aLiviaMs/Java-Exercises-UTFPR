package lista01;

import java.util.Scanner;

public class Ex01 {
    /*
     * Sabe-se que o consumo de um automóvel é de 11,3 Km/l. Elabore um algoritmo
     * que, mediante a leitura de uma distância (em Km), do período de tempo (em
     * horas) utilizado para percorrê-lo, do preço do litro de combustível e do
     * número de pessoas que viajaram no automóvel (incluindo o proprietário),
     * calcule a velocidade média(em Km/h) e o custo da viagem por pessoa. O
     * proprietário do automóvel calcula um adicional de 20% sobre o gasto com
     * combustível para as despesas de manutenção do veículo, a ser dividido entre
     * todos (inclusive o motorista).
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float distanciaKm, tempoPercorrido, precoLitro, velocidadeMedia, custoViagem, precoDividido, valorAdicional,
                custoViagemTotal;
        int numeroDePassageiros;

        float KmPorLitro = 11.3f;

        System.out.println("Digite a distância percorrida em Km. ");
        distanciaKm = scn.nextFloat();

        System.out.println("Digite o período percorrido em horas. ");
        tempoPercorrido = scn.nextFloat();

        System.out.println("Digite o preço do litro de combustível. ");
        precoLitro = scn.nextFloat();

        System.out.println("Digite o numero de pessoas que viajaram no automóvel. ");
        numeroDePassageiros = scn.nextInt();

        velocidadeMedia = distanciaKm / tempoPercorrido;

        custoViagem = ((distanciaKm / KmPorLitro) * precoLitro);
        valorAdicional = custoViagem * 0.20f;
        custoViagemTotal = custoViagem + valorAdicional;

        precoDividido = (custoViagemTotal / numeroDePassageiros);

        System.out.println("\n Velocidade média: " + velocidadeMedia + "\n Custo da viagem: " + custoViagemTotal
                + "\n Custo da viagem por pessoa: " + precoDividido);

    }
}