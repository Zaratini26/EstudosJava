package aulateste_pessoas;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company() {}

    public Company(String name, Double income, Integer numberOfEmployees) {
        super(name, income);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getEmployees() {
        return numberOfEmployees;
    }

    public void setEmployees(Integer employees) {
        this.numberOfEmployees = employees;
    }

    @Override
    public double tax() {
        double basicTax;

        // double basicTax = (numberOfEmployees > 10) ? getAnnualIncome() * 0.14 : getAnnualIncome() * 0.16;

        if (numberOfEmployees > 10) {
            basicTax = getAnnualIncome() * 0.14;
        }
        else {
            basicTax = getAnnualIncome() * 0.16;
        }
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
