package primeiroprojeto.Documentos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter01 {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};

        String path = "C:\\AMD\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
