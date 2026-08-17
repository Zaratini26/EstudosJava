package aulateste_pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> employees = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            if (ch != 'i' && ch != 'c') {
                System.out.println("Invalid input");
                return;
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double expensesHealth = sc.nextDouble();

                employees.add(new Individual(name, income, expensesHealth));

            }
            if (ch == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

               employees.add(new Company(name, income, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("Taxes Paid:");

        double total = 0;
        for (TaxPayer p : employees) {
            System.out.println(p.getName() + ": $ " + String.format("%.2f", p.tax()));
            total += p.tax();
        }
        System.out.println();
        System.out.println("Total taxes: $ " + String.format("%.2f", total));

        sc.close();
    }
}
