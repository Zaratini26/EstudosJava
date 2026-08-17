package aulateste_employees;

import aulateste_employees.entities.Employee;
import aulateste_employees.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (Y/N): ");
            char outsourced = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();

                employees.add(new OutsourcedEmployee(name, hours, value, charge));
            } else {
                employees.add(new Employee(name, hours, value));
            }
        }

            System.out.println();
            System.out.println("Payments:");
            for (Employee e : employees) {
                System.out.println(e);
            }
            sc.close();
        }
    }
