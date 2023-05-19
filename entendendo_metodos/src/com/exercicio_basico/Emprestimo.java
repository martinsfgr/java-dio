package entendendo_metodos.src.com.exercicio_basico;

public class Emprestimo {
    public static void calcularEmprestimo(double valor, int parcelas) {
        if (2 <= parcelas && parcelas <= 12) {
           if (parcelas <= 6) {
               double valorFinal = valor + (valor * 0.3);
               System.out.println("O valor total do empréstimo é de: " + valorFinal);
           } else {
               double valorFinal = valor + (valor * 0.5);
               System.out.println("O valor total do empréstimo é de: " + valorFinal);
           }
        } else {
            System.out.println("Número de parcelas não permitido.");
        }
    }
}
