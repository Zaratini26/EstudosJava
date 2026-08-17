package primeiroprojeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorTipoValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the size of your vector: ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d° height: ", i+1);
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        System.out.println("-".repeat(28));
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%d° height: %.2fm %n", i+1, vect[i]);
        }

        double avg = sum / n;
        System.out.printf("Average height: %.2fm %n", avg);
        sc.close();
    }
}
