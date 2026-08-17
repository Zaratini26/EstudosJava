package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);


        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();
        System.out.println();
        System.out.printf("Amount paid without IOF: R$ %.2f%n", CurrencyConverter.calculationConversion(dollarPrice, dollar));
        System.out.printf("IOF conversion value: R$ %.2f%n", CurrencyConverter.iofCalculation(dollarPrice, dollar));
        System.out.printf("Total amount to be paid in reais: R$ %.2f%n", CurrencyConverter.totalConversionValue(dollarPrice, dollar));

        sc.close();
    }
}
