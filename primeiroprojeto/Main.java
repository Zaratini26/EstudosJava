package primeiroprojeto;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Map<String, LocalDate> birthDates = new HashMap<>();

        birthDates.put("Felipe", LocalDate.parse("26/11/1999", fmt));
        birthDates.put("Lucas", LocalDate.parse("12/02/2000", fmt));

        for (Map.Entry<String, LocalDate> entry : birthDates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().format(fmt));
        }

        Iterator<Map.Entry<String, LocalDate>> i = birthDates.entrySet().iterator();

        System.out.println();
        while (i.hasNext()) {
            Map.Entry<String, LocalDate> entry = i.next();
            System.out.println(entry.getKey() + ": " + entry.getValue().format(fmt));
        }

        sc.close();
    }
}