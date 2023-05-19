package entendendo_metodos.src.com.exercicio_basico;

public class Main {
    public static void main(String[] args) {
        Calculadora.somar(1, 23);
        Calculadora.subtrair(1, 23);
        Calculadora.multiplicar(1, 23);
        Calculadora.dividir(1, 23);

        Mensagem.enviarMensagem(5);
        Mensagem.enviarMensagem(11);
        Mensagem.enviarMensagem(12);
        Mensagem.enviarMensagem(18);
        Mensagem.enviarMensagem(19);
        Mensagem.enviarMensagem(24);
        Mensagem.enviarMensagem(3);
        Mensagem.enviarMensagem(30);

        Emprestimo.calcularEmprestimo(2000, 5);
        Emprestimo.calcularEmprestimo(2000, 7);
        Emprestimo.calcularEmprestimo(10000.50, 5);
        Emprestimo.calcularEmprestimo(10000.50, 7);
    }
}
