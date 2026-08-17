package application;
import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        Student stud = new Student();

        System.out.print("Name: ");
        stud.name = sc.nextLine();

        System.out.print("First note: ");
        stud.grade1 = sc.nextDouble();

        System.out.print("Second note: ");
        stud.grade2 = sc.nextDouble();

        System.out.print("Third note: ");
        stud.grade3 = sc.nextDouble();


        System.out.printf("FINAL GRADE = %.2f%n", stud.finalGrade());

        if (stud.finalGrade() < 60.0) {
            System.out.println("STATUS = FAILED");
            System.out.printf("MISSING %.2f%n", stud.missingPoints());
        }
        else {
            System.out.println("STATUS = PASS");
        }

        sc.close();
    }
}
