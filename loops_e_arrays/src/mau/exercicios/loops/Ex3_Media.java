package loops_e_arrays.src.mau.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o maior número e a média desses números. */


public class Ex3_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;
        int count = 0;

        do {
            System.out.println("Número:");
            numero = scan.nextInt();
            maior = maior < numero ? numero : maior; // Math.max(maior, numero);
            soma = soma + numero;
            count++;
        } while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + soma/5);
    }
}
