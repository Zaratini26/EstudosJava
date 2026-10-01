package primeiroprojeto;

import java.io.IOException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 % n2 == 0 && n2 % n1 == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao Sao Multiplos");
        }
        sc.close();
    }
}