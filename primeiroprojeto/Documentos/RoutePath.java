package primeiroprojeto.Documentos;

import java.io.File;
import java.util.Scanner;

public class RoutePath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Name: " + path.getName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Path: " + path.getPath());
    }
}
