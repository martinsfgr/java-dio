package desafios_basicos.src.com;

import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int porcentagemImpostos = scan.nextInt();

        int custoConsumidor;
        int valorDistribuidor;
        int valorImpostos;

        valorDistribuidor = (custoFabrica*porcentagemDistribuidor)/100;
        valorImpostos = (custoFabrica*porcentagemImpostos)/100;
        custoConsumidor = custoFabrica+valorDistribuidor+valorImpostos;

        System.out.println(custoConsumidor);
    }
}
