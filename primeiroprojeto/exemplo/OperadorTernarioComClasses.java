package primeiroprojeto.exemplo;
import java.util.Scanner;

public class OperadorTernarioComClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        double desconto = aplicarDesconto(preco);
        preco -= desconto;

        System.out.println("R$ " + preco);

        sc.close();
    }

    public static double aplicarDesconto(double preco) {
       return (preco < 20) ? preco * 0.01 : preco * 0.05;
    }
}
