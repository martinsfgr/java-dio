package desafios_basicos.src.com;

import java.util.Scanner;

public class PositivosMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contadorDePositivos = 0;
        double media = 0;
        double x = 0;

        for (int i = 0; i < 6; i++) {
            double entrada = scan.nextDouble();

            if (entrada > 0) {
                contadorDePositivos++;
                x = x + entrada;
            }
        }

        media = x/contadorDePositivos;

        System.out.println(contadorDePositivos + " valores positivos");
        System.out.printf("%.1f%n", media);
    }
}
