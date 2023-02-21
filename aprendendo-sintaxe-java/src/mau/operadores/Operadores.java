package mau.operadores;

public class Operadores {
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String concatenacao = "LINGUAGEM" + " " + "JAVA";
        System.out.println(concatenacao);

        String teste = "1" + 1 + 1 + 1; // output: 1111 (concatena 1 com todos os outros 1)
        System.out.println(teste);

        String testeDois = 1 + 1 + 1 + "1"; // output: 31 (soma 1+1+1 e concatena com 1)
        System.out.println(testeDois);

        String testeTres = 1 + 1 + "1" + 1; // output: 211 (soma 1+1, concatena com 1 e com 1 novamente)
        System.out.println(testeTres);
    }
}
