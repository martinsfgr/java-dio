package entendendo_metodos.src.com.sobrecarga;

public class Quadrilatero {
    public static void area (double lado) {
        System.out.println("Área do quadrado: " + lado*lado);
    }

    public static void area (double ladoUm, double ladoDois) {
        System.out.println("Área do retângulo: " + ladoUm*ladoDois);
    }

    public static void area (double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura)/2);
    }

    public static void area (float diagonalUm, float diagonalDois) {
        System.out.println("Área do losango: " + (diagonalUm*diagonalDois)/2);
    }
}
