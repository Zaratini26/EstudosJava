package primeiroprojeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você vai digitar [max = 10]: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("-".repeat(25));
        System.out.println("Números negativos: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d%n", vect[i]);
            }
        }


        sc.close(); 
    }
}
