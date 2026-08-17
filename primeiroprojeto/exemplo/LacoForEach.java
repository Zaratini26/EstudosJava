package primeiroprojeto.exemplo;

import java.util.Locale;
import java.util.Scanner;

public class LacoForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        int qntd = 0;

        System.out.print("Quantos números você vai digitar [max = 10]: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("-".repeat(25));
        System.out.println("Números negativos: ");

        for (int num : vect) {
            if (num < 0) {
                qntd += num;
                System.out.printf("%d%n", num);
            }
        }
        System.out.println();
        System.out.println("Somas dos números negativos digitados: " + qntd);
        sc.close();
    }
}