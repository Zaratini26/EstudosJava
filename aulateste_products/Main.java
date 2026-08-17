package aulateste_products;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Product #%d data:%n", i);

            System.out.print("Common, used or imported (c/u/i)? ");
            char c = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();


            if (c == 'i') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, fee));
            }
            else if (c == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date01 = LocalDate.parse(sc.next(), fmt01);

                products.add(new UsedProduct(name, price, date01));
            }
            else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("Price Tags:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
