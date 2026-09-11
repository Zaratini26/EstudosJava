package primeiroprojeto.generics.exemplo01.application;

import primeiroprojeto.generics.exemplo01.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values: ");
        int n = sc.nextInt();

        System.out.println("Enter the value:");
        for (int i = 0; i < n; i++) {
            ps.addList(sc.nextInt());
        }

        ps.print();
        System.out.println("First: " + ps.first());

    }
}