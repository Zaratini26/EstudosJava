package application;
import entities.Rectangle;
import java.util.Locale;

import java.util.Scanner;

public class ProgramThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        Rectangle rect = new Rectangle();

        System.out.print("Enter rectangle width: ");
        rect.width = sc.nextDouble();

        System.out.print("Enter rectangle height: ");
        rect.height = sc.nextDouble();

        System.out.printf("Area: %.2f%n", rect.area());
        System.out.printf("Perimeter: %.2f%n", rect.perimeter());
        System.out.printf("Diagonal: %.2f%n", rect.diagonal());

        sc.close();
    }
}
