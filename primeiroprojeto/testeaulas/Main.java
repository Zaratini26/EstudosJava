package primeiroprojeto.testeaulas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = Utilitarios.leiaInt(sc, "Digite um número: ", 0);

            if (!Utilitarios.continuar(sc)) {
                System.out.printf("você digitou o número: %d%nEncerrando...", num);
                break;
            }

        }
        sc.close();
    }
}
