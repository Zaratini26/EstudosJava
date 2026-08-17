package primeiroprojeto.exemplo;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the matriz size: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter the line value %d, row %d: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Main diagonal: ");

        for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        int negativos = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    negativos++;
                }
            }
        }
        System.out.println("Negative numbers = " + negativos + " numbers");

    sc.close();
    }
}
