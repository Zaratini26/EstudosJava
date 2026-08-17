package aula0101;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Mario", 111, 2000.0, 500.0);
        Conta conta2 = new Conta("Luigi", 125, 1000.0, 200.0);

        System.out.println(conta1);
        System.out.println(conta2);

        System.out.println("-".repeat(55));

        conta1.transferir(200.0, conta2);

        System.out.println(conta1);
        System.out.println(conta2);
    }
}