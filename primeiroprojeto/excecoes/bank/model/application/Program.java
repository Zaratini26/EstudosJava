package primeiroprojeto.excecoes.bank.model.application;

import primeiroprojeto.excecoes.bank.model.entities.Account;
import primeiroprojeto.excecoes.bank.model.exception.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial Balance: $ ");
            double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: $ ");
            double withdrawLimit = sc.nextDouble();

            Account ac1 = new Account(number, holder, initialBalance, withdrawLimit);
            System.out.println();

            System.out.print("Enter amount for withdraw: $ ");
            double amount = sc.nextDouble();

            ac1.withdraw(amount);
            System.out.printf("New Balance: $%.2f%n", ac1.getBalance());
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input, please try again");
        }
        catch (DomainException e) {
            System.out.println("Withdraw Error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error occurred: " +
                    (e.getMessage() != null ? e.getMessage() : e.getClass().getSimpleName()));
        }
    }
}