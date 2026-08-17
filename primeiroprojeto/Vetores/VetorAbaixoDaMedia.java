package primeiroprojeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorAbaixoDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.println();
        double media = sum / vect.length;
        System.out.printf("Média do Vetor = %.3f%n", media);

        System.out.println("Elementos Abaixo da Média: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }
        sc.close();
    }
}
