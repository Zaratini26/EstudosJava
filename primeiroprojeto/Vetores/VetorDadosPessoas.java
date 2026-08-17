package primeiroprojeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorDadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        double alturaFemTotal = 0;
        int qntdHomens = 0;
        int qntdMulheres = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("-".repeat(30));
            System.out.printf("Altura da %d° pessoa: ", i+1);
            alturas[i] = sc.nextDouble();

            System.out.printf("Gênero da %d° pessoa [M ou F]: ", i+1);
            generos[i] = sc.next().toUpperCase().charAt(0);

            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (generos[i] == 'M') {
                qntdHomens++;
            }
            else if (generos[i] == 'F') {
                alturaFemTotal += alturas[i];
                qntdMulheres++;
            }

        }
        System.out.println("=".repeat(30));
        System.out.printf("Menor altura = %.2fm %n", menorAltura);
        System.out.printf("Maior altura = %.2fm %n", maiorAltura);
        if (qntdMulheres > 0) {
            System.out.printf("Média altura das mulheres: %.2fm %n", alturaFemTotal / qntdMulheres);
        }
        else {
            System.out.println("Não foram digitadas mulheres para calcular a média.");
        }
        System.out.println("Número de homens = " + qntdHomens);
        System.out.println("Número de mulheres = " + qntdMulheres);


        sc.close();
    }
}
