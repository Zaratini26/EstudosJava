package primeiroprojeto.exemplo;

import entities.ClassePlanetasEnum;

import java.util.Scanner;

public class EnumsPlanetas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Para qual planeta vai viajar? ");
        String planetas = sc.nextLine().toUpperCase().trim();

        ClassePlanetasEnum p1 = new ClassePlanetasEnum(planetas);
        p1.viajarPlanetas();

        sc.close();
    }
}
