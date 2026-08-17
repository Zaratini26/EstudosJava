package primeiroprojeto.Vetores;

import java.util.Scanner;

public class VetorNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números Pares: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d " , vect[i]);
            }
        }

        System.out.println();
        System.out.println("Quantidade de pares: " + vect.length);

        sc.close();
    }
}
