package primeiroprojeto.Vetores;

import java.util.Scanner;

public class VetorPessoaMaisVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        int maiorIdade, posicao;
        maiorIdade = posicao = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %d° pessoa:%n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicao = i;
            }
        }
        System.out.println("-".repeat(30));
        System.out.printf("Entity mais velha: %s%n", nomes[posicao]);


        sc.close();
    }
}
