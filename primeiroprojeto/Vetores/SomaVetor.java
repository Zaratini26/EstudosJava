package primeiroprojeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);


        System.out.print("Quantos números você vai digitar (max 10): ");
        int num = sc.nextInt();
        double[] vect = new double[num];

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];

        }

        double media = sum / vect.length;

        System.out.println("-".repeat(30));
        System.out.print("Valores = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.println();
        System.out.printf("Soma = %.2f%n", sum);
        System.out.printf("Média = %.2f%n", media);

        sc.close();
    }
}
