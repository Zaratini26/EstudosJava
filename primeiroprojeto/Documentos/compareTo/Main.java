package primeiroprojeto.Documentos.compareTo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> names = new ArrayList<>();

        String path = "C:\\AMD\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                names.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(names);
            for (Employee nome : names) {
                System.out.println(nome.getName() +  ", " + nome.getSalary());
            }
        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
