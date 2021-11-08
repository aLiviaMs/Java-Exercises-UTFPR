package lista02;

public class Retangulo extends Ponto {
    int base;
    int altura;

    public Retangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public static double calcularArea(Retangulo Rect) {
        double baseRetangulo = Rect.base;
        double alturaRetangulo = Rect.altura;
        double areaRetangulo = baseRetangulo * alturaRetangulo;

        return areaRetangulo;
    }

    public static String isSobreposto(Retangulo retangulo1, Retangulo retangulo2) {
        if (retangulo1.x < retangulo2.x + retangulo2.base && retangulo1.x + retangulo1.base > retangulo2.x
                && retangulo1.y < retangulo2.y + retangulo2.altura && retangulo1.y + retangulo1.altura > retangulo2.y) {
            return "Retangulos estão colidindo";
        } else {
            return "Retangulos não estão colidindo";
        }
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(3, 6, 20, 10);
        Retangulo retangulo2 = new Retangulo(50, 30, 5, 6);

        System.out.println("AreaR1: " + calcularArea(retangulo1) + " AreaR2: " + calcularArea(retangulo2));
        System.out.println("Estão colidindo? " + isSobreposto(retangulo1, retangulo2));
    }

}
