package primeiroprojeto.exemplo;

import java.util.Scanner;

public class MatrizTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int l = sc.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];
        System.out.println();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Digite o valor da linha %d, coluna %d: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Qual número deseja localizar na matriz? ");
        int n = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (n == matriz[i][j]) {
                    System.out.println();
                    System.out.println("Position: " + i + "," + j);

                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i -1][j]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }

        }
        sc.close();
    }
}
