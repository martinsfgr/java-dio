package entendendo_metodos.src.com.exercicio_basico;

public class Calculadora {
    public static void somar(double a, double b) {
        double resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }

    public static void subtrair(double a, double b) {
        double resultado = a - b;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    public static void multiplicar(double a, double b) {
        double resultado = a * b;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    public static void dividir(double a, double b) {
        double resultado = a / b;
        System.out.println("O resultado da divisão é: " + resultado);
    }
}
