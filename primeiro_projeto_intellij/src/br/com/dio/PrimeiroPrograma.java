package primeiro_projeto_intellij.src.br.com.dio;

import primeiro_projeto_intellij.src.br.com.dio.model.Gato;
import primeiro_projeto_intellij.src.br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("Vidas Secas", 250);

        System.out.println(gato);
        System.out.println(livro);

        int a = 5;
        int b = 5;
        System.out.println("Hello World " + (a + b));
    }
}
