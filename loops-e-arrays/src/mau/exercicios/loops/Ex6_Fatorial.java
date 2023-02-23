package mau.exercicios.loops;

/* Faça um programa que calcule o fatorial de um número fornecido pelo usuário. */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial:");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        for(int i = fatorial; i >= 1; i--){
           multiplicacao = multiplicacao * i;
        }

        System.out.println("Resultado da fatorial: " + multiplicacao);
    }
}
