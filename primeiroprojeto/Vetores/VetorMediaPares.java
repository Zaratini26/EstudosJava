package primeiroprojeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorMediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int sumPares = 0;
        int qntdPares = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                sumPares += vect[i];
                qntdPares++;
            }
        }

        if (qntdPares > 1) {
            double media = (double)sumPares / qntdPares;
            System.out.printf("Média dos Pares = %.1f%n", media);
        }
        else {
            System.out.println("Nenhum número par digitado!");
        }

        sc.close();
    }
}
