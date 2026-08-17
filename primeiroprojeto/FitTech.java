package primeiroprojeto;

import entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class FitTech {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        double peso = validDouble(sc, "Digite seu peso: ", 10.0, 300.0);
        double altura = validDouble(sc, "Digite sua altura: ", 0.5, 2.5);

        String objetivo;
        while (true) {
            System.out.print("Qual seu objetivo [Ganhar/Perder] peso: ");
            objetivo = sc.next().toUpperCase();
            if (objetivo.equalsIgnoreCase("GANHAR") || objetivo.equalsIgnoreCase("PERDER")) break;
            System.out.println("ERRO! digite apenas Ganhar ou Perder!");
            }

        Alunos aluno = new Alunos(nome, peso, altura, objetivo);

        System.out.println("-".repeat(30));
        System.out.println(aluno);
        System.out.printf("Seu IMC é: %.2f%n", aluno.calcularIMC());

    sc.close();
    }

    private static double validDouble(Scanner sc, String mensagem, double min, double max) {
        double valor;

        while (true) {
            System.out.print(mensagem);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                if (valor >= min && valor <= max) return valor;
            }
            else {
                sc.next();
            }
            System.out.println("ERRO! digite somente valores válidos!");
        }
        

    }
}
