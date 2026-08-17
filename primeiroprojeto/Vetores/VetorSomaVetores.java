package primeiroprojeto.Vetores;

import java.util.Scanner;

public class VetorSomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor: ");
        int n = sc.nextInt();

        int[] primeiroVetor = new int[n];
        int[] segundoVetor = new int[n];

        System.out.println("Digite os valores do primeiros vetor: ");
        for (int i = 0; i < primeiroVetor.length; i++) {
            System.out.printf("%d° valor: ", i+1);
            primeiroVetor[i] = sc.nextInt();
        }
        System.out.println("-".repeat(35));
        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < segundoVetor.length; i ++) {
            System.out.printf("%d° valor: ", i+1);
            segundoVetor[i] = sc.nextInt();
        }

        System.out.println("-".repeat(35));
        System.out.println("Vetor Resultante:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d° = %d%n", i+1, primeiroVetor[i] + segundoVetor[i]);
        }
        sc.close();
    }
}
