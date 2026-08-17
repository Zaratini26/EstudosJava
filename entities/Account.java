package entities;

public class Account {

    private static final double TAX = 5.0;

    // Attributes
    private int account;
    private String holder;
    private double balance;

    // Constructors
    public Account() {
    }

    public Account(int account, String holder, double initialDeposit) {
        this.account = account;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int account, String holder) {
        this.account = account;
        this.holder = holder;
    }

    // Encapsulate Getters and Setters
    public int getAccount() {
        return account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // métodos

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= (value + TAX);
    }

    @Override
    public String toString() {
        return "Account "
                + account
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);

    }
}
