package mau.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que peça N números inteiros e
* calcule e mostre a quantidade de números pares e a quantidade de números ímpares*/

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de números inteiros:");
        int N = scan.nextInt();

        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int count = 0;

        do {
            System.out.println("Digite um número:");
            int numero = scan.nextInt();

            if(numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;
        } while(count < N);

        System.out.println("Quantidade de pares: " + quantidadePares);
        System.out.println("Quantidade de ímpares: " + quantidadeImpares);
    }
}
