package lista02;

public class Ponto {
    int x;
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distancia(Ponto p1, Ponto p2) {
        double eixoX = p2.x - p1.x;
        double eixoY = p2.y - p1.y;
        double dist = Math.sqrt(Math.pow(eixoX, 2) + Math.pow(eixoY, 2));
        return dist;
    }

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(3, 6);
        Ponto ponto2 = new Ponto(9, 4);

        System.out.println(distancia(ponto1, ponto2));
    }

}
