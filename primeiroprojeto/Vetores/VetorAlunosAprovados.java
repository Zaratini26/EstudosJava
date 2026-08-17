package primeiroprojeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorAlunosAprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        double[] primeirasNotas = new double[n];
        double[] segundasNotas = new double[n];
        int posicao;

        for (int i = 0; i < n; i++) {
            System.out.println("-".repeat(30));
            System.out.printf("%d° Aluno: %n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("1° Nota: ");
            primeirasNotas[i] = sc.nextDouble();

            System.out.print("2° Nota: ");
            segundasNotas[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("-".repeat(30));
        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < n; i++) {
            double media = 6.0;
            if (((primeirasNotas[i] + segundasNotas[i]) / 2) >= media) {
                posicao = i;
                System.out.printf("%s%n", nomes[posicao]);
            }
        }

        sc.close();
    }
}
