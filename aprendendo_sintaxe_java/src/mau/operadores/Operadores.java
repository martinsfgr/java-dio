package aprendendo_sintaxe_java.src.mau.operadores;

public class Operadores {
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;

        String concatenacao = "LINGUAGEM" + " " + "JAVA";
        System.out.println(concatenacao);

        String teste = "1" + 1 + 1 + 1; // output: 1111 (concatena 1 com todos os outros 1)
        System.out.println(teste);

        String testeDois = 1 + 1 + 1 + "1"; // output: 31 (soma 1+1+1 e concatena com 1)
        System.out.println(testeDois);

        String testeTres = 1 + 1 + "1" + 1; // output: 211 (soma 1+1, concatena com 1 e com 1 novamente)
        System.out.println(testeTres);

        int numero = 5;
        numero = -numero; // converte para negativo
        System.out.println(numero);

        numero = numero * -1; // converte para positivo
        System.out.println((numero));

        numero++; // incrementa
        System.out.println(numero);

        numero--; // decrementa
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel; // inverte o valor booleano
        System.out.println(variavel); // output: false

        int a, b;

        a = 6;
        b = 5;

        String resultado = a == b ? "verdadeiro" : "falso"; // verificação de igualdade
        System.out.println(resultado);

        resultado = a >= b ? "verdadeiro" : "falso"; // verificação de maior ou igual
        System.out.println(resultado);

        resultado = a <= b ? "verdadeiro" : "falso"; // verificação de menor ou igual
        System.out.println(resultado);


        boolean condicao1, condicao2;
        condicao1 = true;
        condicao2 = false;

        if(condicao1 && condicao2){ // verificar se as duas são verdadeiras
            System.out.println("as duas são verdadeiras");
        }

        if(condicao1 || condicao2){ // verificar se pelo menos uma das duas é verdadeira
            System.out.println("uma é verdadeira");
        }
    }
}
