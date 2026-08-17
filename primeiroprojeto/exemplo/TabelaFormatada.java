package primeiroprojeto.exemplo;

public class TabelaFormatada {
    public static void main(String[] args) {
            String p1 = "Arroz";
            String p2 = "Feijão";
            String p3 = "Azeite Extra Virgem";

            double v1 = 25.50;
            double v2 = 9.80;
            double v3 = 42.00;

            System.out.println("------------------------------------------");
            System.out.printf("%-20s | %10s %n", "PRODUTO", "PREÇO");
            System.out.println("------------------------------------------");

            // %-20s -> Reserva 20 espaços, alinhado à ESQUERDA (por causa do -)
            // %10.2f -> Reserva 10 espaços, alinhado à DIREITA, com 2 casas decimais
            System.out.printf("%-20s | %10.2f %n", p1, v1);
            System.out.printf("%-20s | %10.2f %n", p2, v2);
            System.out.printf("%-20s | %10.2f %n", p3, v3);

            System.out.println("------------------------------------------");
        }
}