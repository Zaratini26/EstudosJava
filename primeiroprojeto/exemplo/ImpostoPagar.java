package primeiroprojeto.exemplo;
import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

public class ImpostoPagar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000) {
            imposto = 0.0;
        }
        else if (salario <= 3000) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }
        if (imposto == 0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }

    public static class ProgramPost {
        public static void main(String[] args) throws ParseException {

            DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            Comment c1 = new Comment("Have a nice trip!");
            Comment c2 = new Comment("Wow that's awesome!");
            Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", sdf),
                    "Travelling to New Zealand", "I'm going to visit this wonderful country!", 12);

            p1.addComment(c1);
            p1.addComment(c2);

            Comment c3 = new Comment("Good night");
            Comment c4 = new Comment("May the Force be with you");
            Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", sdf), "Good night guys",
                    "See you tomorrow", 5);

            p2.addComment(c3);
            p2.addComment(c4);

            System.out.println(p1);
            System.out.println(p2);
        }
    }
}
