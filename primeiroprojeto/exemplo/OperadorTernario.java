package primeiroprojeto.exemplo;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
        preco -= desconto;

        System.out.println("Preço final: R$ " + preco);

        sc.close();
    }
}