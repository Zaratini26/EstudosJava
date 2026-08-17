package primeiroprojeto.Vetores;

import java.util.Scanner;

public class VetorMaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int num = sc.nextInt();

        int[] vect = new int[num];
        int max = vect[0];
        int posicao = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();

            if (vect[i] > max) {
                max = vect[i];
                posicao = i;
            }
        }
        System.out.println();
        System.out.println("Maior valor = " + max);
        System.out.println("Posição do maior valor: " + posicao);

        sc.close();
    }
}
