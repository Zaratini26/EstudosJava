package primeiroprojeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[][] numbers = new int[3][3];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;

        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;

        for (int[] base : numbers) {
            for (int n : base) {
                System.out.print(n +  " ");
            }
            System.out.println();
        }
        sc.close();
    }
}