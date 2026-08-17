package Exercicio;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(101, "Alex Green", 0.0);
        BusinessAccount bAcc = new BusinessAccount(202, "Maria Flower", 0.0, 100.0);

        // UpCasting

        Account acc1 = bAcc;
        Account acc2 = new BusinessAccount(203, "Milton Blue", 0.0, 200.0);
        Account acc3 = new SavingsAccount(303, "Zoro", 0.0, 0.01);

        // DownCasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(500.0);

        if (acc2 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc2;
            acc5.loan(500.0);
            System.out.println("Loan Successful");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
    }
}
