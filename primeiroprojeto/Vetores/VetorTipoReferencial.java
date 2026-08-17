package primeiroprojeto.Vetores;

import entities.ProductVector;
import java.util.Locale;
import java.util.Scanner;

public class VetorTipoReferencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the vector size: ");
        int n = sc.nextInt();
        System.out.println("-".repeat(35));

        ProductVector[] vect = new ProductVector[n];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Enter the product name: ");
            String name = sc.nextLine();

            System.out.print("Enter the product price: $ ");
            double price = sc.nextDouble();
            System.out.println("-".repeat(35));

            vect[i] = new ProductVector(name, price);
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("Average price: $ %.2f%n", avg);

        sc.close();
    }
}
