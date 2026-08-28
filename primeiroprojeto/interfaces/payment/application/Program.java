package primeiroprojeto.interfaces.payment.application;

import primeiroprojeto.interfaces.payment.services.BrazilInterestService;
import primeiroprojeto.interfaces.payment.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " +  months + " months:");
        System.out.printf("%.2f%n", payment);
    }
}