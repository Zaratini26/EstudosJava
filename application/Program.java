package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b  = sc.nextDouble();
        y.c  = sc.nextDouble();

        double areaX =  x.area();

        double areaY = y.area();

        System.out.println("-".repeat(39) );
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("Larger area X: %.4f%n", areaX);
        }
        else {
            System.out.printf("Larger area Y: %.4f%n", areaY);
        }

        sc.close();
    }
}
