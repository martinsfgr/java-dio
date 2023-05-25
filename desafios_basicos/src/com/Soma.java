package desafios_basicos.src.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double h = 0;

        for (int i = 1; i <= n; i++) {
            double o = (double) 1 / i;
            h = h + o;
        }

        System.out.println(formatador.format(h));
    }
}
