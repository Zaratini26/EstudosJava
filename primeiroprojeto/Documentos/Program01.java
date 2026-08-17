package primeiroprojeto.Documentos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        File file = new File("C:\\AMD\\in.txt");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}