package primeiroprojeto.sets.ex004.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int studentsA = sc.nextInt();
        addStudents(a, studentsA);

        System.out.print("How many students for course B? ");
        int studentsB = sc.nextInt();
        addStudents(b, studentsB);

        System.out.print("How many students for course A? ");
        int studentsC = sc.nextInt();
        addStudents(c, studentsC);

        Set<Integer> total =  new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }

    public static void addStudents(Set<Integer> set, int quantity) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= quantity; i++) {
            int idStudent = sc.nextInt();

            set.add(idStudent);
        }
    }
}