package exercicios;

public class Ex10_CopiaArray {
    public static void main(String[] args) {
        encontraValor();
    }

    private static void encontraValor() {
        int[] arrayInicial = { 1, 2, 3, 5, 84, 75, 78, 4, 55 };
        int[] arrayCopia = new int[arrayInicial.length];
        int separacao = 1;

        System.out.print("Valores ArrayPrimaria: {1,2,3,5,84,75,78,4,55} \n");
        System.out.print("Valores ArrayCopia: ");
        System.out.print("[");

        for (int i = 0; i < arrayCopia.length; i++) {
            arrayCopia[i] = arrayInicial[i];

            if (separacao < arrayCopia.length)
                System.out.print(arrayCopia[i] + ",");
            else
                System.out.print(arrayCopia[i]);

            separacao++;
        }
        System.out.print("]");
    }
}
