package application;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product produce = new Product(name, price, quantity);

        System.out.println();
        produce.setName("Computer");
        System.out.println("Updated name: " + produce.getName());
        produce.setPrice(1200.00);
        System.out.println("Updated price: " + produce.getPrice());
        System.out.println("Updated quantity: " + produce.getQuantity());


        System.out.println("Product data: " + produce);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        produce.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + produce);
        System.out.println();

        System.out.print("Enter the number of products to be remove from stock: ");
        quantity = sc.nextInt();
        produce.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + produce);

        System.out.println();
        System.out.println("Finishing up...");
        sc.close(); 
    }
}
