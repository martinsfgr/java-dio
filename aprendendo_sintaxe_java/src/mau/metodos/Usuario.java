package aprendendo_sintaxe_java.src.mau.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Tv tv = new Tv();

        tv.ligar();
        System.out.println("Status da TV: " + tv.ligada);

        tv.desligar();
        System.out.println("Status da TV: " + tv.ligada);

        tv.aumentarVolume();
        System.out.println("Aumentando o volume: "+ tv.volume);

        tv.diminuirVolume();
        System.out.println("Diminuindo o volume: " + tv.volume);

        tv.aumentarCanal();
        System.out.println("Aumentando o canal: " + tv.canal);

        tv.diminuirCanal();
        System.out.println("Diminuindo o canal: " + tv.canal);

        tv.definirCanal(5);
        System.out.println("Definindo o canal: " + tv.canal);
    }
}
