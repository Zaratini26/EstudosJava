package primeiroprojeto.exemplo;
import java.util.Scanner;

public class FormulaDeBaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a = 1, b = -5, c = 6 para exemplo;

        System.out.print("Digite A: ");
        double a = sc.nextDouble();

        System.out.print("Digite B: ");
        double b = sc.nextDouble();

        System.out.print("Digite C: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4*a*c);

        if (delta < 0) {
            System.out.println("A equação não possuí raízes reais!");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Delta: " + delta);
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        }
        sc.close();
    }
}
