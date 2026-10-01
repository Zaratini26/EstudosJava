package primeiroprojeto.maps.exercicioVotos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

       try (Scanner sc = new Scanner(System.in)) {

           System.out.println("Enter file full path: ");
           String path = sc.nextLine();

           Map<String, Integer> votes = new TreeMap<>();

           try (BufferedReader br = new BufferedReader(new FileReader(path))) {

               String line = br.readLine();

               while (line != null) {
                   String[] fields = line.split(",");

                   String name = fields[0];
                   int quantityVotes = Integer.parseInt(fields[1]);

                   int count = votes.getOrDefault(name, 0);
                   votes.put(name, count + quantityVotes);

                   line = br.readLine();
               }
               for (Map.Entry<String, Integer> entry : votes.entrySet()) {
                   System.out.println(entry.getKey() + ": " + entry.getValue());
               }
           }
           catch (IOException e) {
               System.out.println("Error: " + e.getMessage());
           }
       }
    }
}