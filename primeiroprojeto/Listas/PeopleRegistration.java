package primeiroprojeto.Listas;
import entities.EmployeeRegistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PeopleRegistration {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeRegistration> list = new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("-".repeat(25));
            System.out.printf("Employee #%d: %n", i+1);

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new EmployeeRegistration(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        EmployeeRegistration emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (EmployeeRegistration obj : list) {
            System.out.println(obj);
        }

    sc.close();
    }

    private static boolean hasId(List<EmployeeRegistration> list, int id) {
        for (EmployeeRegistration emp : list) {
            if (emp.getId() == id) {
                return true;
            }
        }
        return false;
    }
}