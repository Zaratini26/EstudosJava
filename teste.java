
import java.util.InputMismatchException;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 2, 3};

        System.out.print("Enter the number you wish to view: ");
        int n = sc.nextInt();

        try {
            System.out.println(numbers[n]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Fora do raio da lista! tamanho da lista: " + numbers.length);

        } catch (InputMismatchException e) {
            System.err.println("Erro ao inserir valor inteiro!");

        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
        }

        sc.close();
    }
}
