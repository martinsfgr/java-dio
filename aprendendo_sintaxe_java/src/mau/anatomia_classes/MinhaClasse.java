package aprendendo_sintaxe_java.src.mau.anatomia_classes;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Estou dentro do método");

        String primeiroNome = "Mauricio";
        String segundoNome = "Fagner";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        int anoFabricacao = 2022;
        boolean fazSol = true;
        boolean estaChovendo = false;

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "O resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
