package primeiroprojeto.Vetores;

import entities.RentPensionato;

import java.util.Locale;
import java.util.Scanner;

public class VetorPensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        RentPensionato[] vect = new RentPensionato[10];

        for (int i = 0; i < n; i++) {
            System.out.println("-".repeat(30));
            System.out.printf("Rent #%d: %n", i+1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            vect[room] = new RentPensionato(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
