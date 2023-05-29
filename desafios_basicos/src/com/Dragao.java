package desafios_basicos.src.com;

import java.util.Scanner;

public class Dragao {
    public static void main(String[] args) {
        int casos, poderDeLuta;

        Scanner leitor = new Scanner(System.in);

        casos = leitor.nextInt();

        for (int i = 0; i < casos; i++) {
            poderDeLuta = leitor.nextInt();
            if (poderDeLuta <= 8000) {
                System.out.println("Inseto");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }
}
