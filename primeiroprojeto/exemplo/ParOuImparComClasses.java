package primeiroprojeto.exemplo;
import java.util.Scanner;

public class ParOuImparComClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        String resultado = checarParidade(numero);

        System.out.println("O número " + numero + " é : " + resultado);
        
        sc.close();
    }
    public static String checarParidade(int n) {
        if (n % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    
    }
}
