package aulateste_pessoas;

public class Individual extends TaxPayer {

    private Double expensesHealth;

    public Individual() {}

    public Individual(String name, Double income, Double expensesHealth) {
        super(name, income);
        this.expensesHealth = expensesHealth;
    }

    public Double getExpensesHealth() {
        return expensesHealth;
    }

    public void setExpensesHealth(Double expensesHealth) {
        this.expensesHealth = expensesHealth;
    }

    @Override
    public double tax() {
        double basicTax;

        // double basicTax = (getAnnualIncome() < 20000.00) ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;

        if (getAnnualIncome() < 20000.00) {
            basicTax = getAnnualIncome() * 0.15;
        }
        else {
            basicTax = getAnnualIncome() * 0.25;
        }
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        if (getExpensesHealth() > 0) {
            return basicTax - (getExpensesHealth() * 0.5);
        }
        return basicTax;
    }
}
