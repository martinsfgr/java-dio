package mau.exercicios.loops;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada, onde o usuário irá informar qualquer inteiro entre 0 a 10.
* A saída conterá o resultado da tabuada do número informado.*/

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));

        System.out.println("Digite a tabuada que deseja gerar:");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " * " + i + " = " + tabuada*i);
        }
    }
}
