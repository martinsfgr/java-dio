package entendendo_metodos.src.com.sobrecarga;

public class Quadrilatero {
    public static double area (double lado) {
        double resultado = lado*lado;

        System.out.println("Área do quadrado: " + resultado);
        return resultado;
    }

    public static double area (double ladoUm, double ladoDois) {
        double resultado = ladoUm*ladoDois;

        System.out.println("Área do retângulo: " + resultado);
        return resultado;
    }

    public static double area (double baseMaior, double baseMenor, double altura) {
        double resultado = ((baseMaior+baseMenor)*altura/2);

        System.out.println("Área do trapézio: " + resultado);
        return resultado;
    }

    public static float area (float diagonalUm, float diagonalDois) {
        float resultado = (diagonalUm*diagonalDois)/2;

        System.out.println("Área do losango: " + resultado);
        return resultado;
    }
}
