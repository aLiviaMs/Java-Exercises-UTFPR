package lista02;

public class Pessoa {

    static void fazerAniversario() {
        int idade = 19;
        String nome = "Lívia";

        for (int i = 0; i < idade; i++) {
            idade++;
        }
        System.out.print("Nome: " + nome + "Idade: " + idade);
    }

    class NewClass extends Pessoa {
        public static void main(String[] args) {
            fazerAniversario();
        }
    }
}
