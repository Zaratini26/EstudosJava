package primeiroprojeto.exemplo;
import java.util.Scanner;

public class UsoSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o número do dia da semana [de 1 a 7]: ");
        int x = sc.nextInt();

        String dia = switch (x) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Valor inválido";
        };

        System.out.printf("Dia da semana: %s%n", dia);

        sc.close();
    }
}
