package primeiroprojeto.Vetores;

import entities.ProductHeight;
import java.util.Locale;
import java.util.Scanner;

public class VetorProblemaAlturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Quantas pessoas serão digitadas: ");
        int number = sc.nextInt();
        sc.nextLine();

        ProductHeight[] vect = new ProductHeight[number];
        double sumAltura = 0;
        int menores = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("-".repeat(30));
            System.out.printf("Dados da %d° pessoa: %n", i+1);

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new ProductHeight(nome, idade, altura);
            sumAltura += vect[i].getHeight();
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                menores ++;
            }
        }

        double alturaMedia = sumAltura / vect.length;
        double percentualMenores = ((double) menores / number) * 100.0;

        System.out.println("-".repeat(30));
        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n" ,percentualMenores);

        for (int i = 0; i < number; i++) {
            if (vect[i].getAge() < 16) {
                System.out.printf("%s%n", vect[i].getName());
            }
        }
        sc.close();
    }
}
