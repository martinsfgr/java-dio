package mau.exercicios.arrays;

/* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0, -8, 2, 4, 1, 7};
        System.out.println(vetor);

        // Vetor:
        System.out.print("Vetor: ");
        int count = 0;
        while(count <= (vetor.length - 1)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        // Vetor inverso:
        System.out.print("\nVetor Inverso: ");
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
