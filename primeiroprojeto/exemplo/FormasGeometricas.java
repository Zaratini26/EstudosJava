package primeiroprojeto.exemplo;
import java.util.Scanner;
import java.util.Locale;

public class FormasGeometricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("1° valor: ");
        double a = sc.nextDouble();

        System.out.print("2° valor: ");
        double b = sc.nextDouble();

        System.out.print("3° valor: ");
        double c = sc.nextDouble();

        double triangulo = (a * c ) /2;
        double pi = 3.14159;
        double circulo = (pi * Math.pow(c, 2));
        double trapezio = ((a + b) * c) /2;
        double quadrado = (Math.pow(b, 2));
        double retangulo = (a * b);

        System.out.println("-------------------");
        System.out.println("Formas Geométricas");
        System.out.println("-------------------");
        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();
    }
}
