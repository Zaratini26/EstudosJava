package primeiroprojeto.exemplo;
import java.util.Scanner;

public class MediaNotasComClasses {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite um número: ");
        n2 = sc.nextDouble();

        media = (n1 + n2) / 2;
        String result = checarMedia(media);

        System.out.println("A média das notas é: " + media);
        System.out.println("Status: " + result);

        sc.close();
    }

    public static String checarMedia (double media) {
        if (media >= 7) {
            return "Aprovado"; }
        else {
            return "Reprovado"; }
    }
}
