package primeiroprojeto.testeaulas;
import java.util.Scanner;
import java.util.Locale;

public class Utilitarios {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static boolean continuar(Scanner sc) {
        while (true) {
            System.out.print("Deseja continuar [S ou N]: ");
            String opcao = sc.nextLine().trim().toUpperCase();

            if (opcao.equals("S")) {
                return true;
            } else if (opcao.equals("N")) {
                return false;
            } else {
                exibirErro("ERRO! digite somente S ou N para prosseguir!");
            }
        }
    }

    public static int leiaInt(Scanner sc, String mensagem, int min) {
        while (true) {
            try {
                System.out.print(mensagem);
                int num = sc.nextInt();
                sc.nextLine();

                if (num < min) {
                    exibirErro("ERRO! digite somente números inteiros positivos!");
                    continue;
                }
                return num;

            } catch (Exception e) {
                exibirErro("ERRO! digite somente números inteiros válidos!");
                sc.nextLine();
            }
        }
    }

    private static void exibirErro(String msg) {

        System.out.println(ANSI_RED + ">> " + msg + ANSI_RESET);
    }

    public static String leiaString(Scanner sc, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = sc.nextLine().trim();

                if (entrada.isEmpty()) {
                    exibirErro("ERRO! digite um nome válido!");
                    continue;
                }
                if (entrada.matches("[a-zA-ZÀ-ÿ\\s]+")) {
                    return entrada;
                } else {
                    exibirErro("ERRO! digite apenas letras!");
                }
            } catch (Exception e) {
                exibirErro("ERRO! entrada inválida!");
            }
        }
    }

    public static Double lerDouble(Scanner sc, String mensagem, double min) {
        sc.useLocale(Locale.US);

        while (true) {
            try {
                System.out.print(mensagem);
                double num = sc.nextDouble();
                sc.nextLine();

                if (num < min) {
                    exibirErro("O valor deve ser no mínimo " + min + "!");
                    continue;
                }
                return num;
            } catch (RuntimeException e) {
                exibirErro("Digite um número decimal válido (use ponto para decimais)!");
                sc.nextLine();
            }
        }
    }
}
