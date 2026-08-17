package aulateste_employees.entities;

public class OutsourcedEmployee extends Employee {

    // Attributes
    private double additionalCharge;

    // Constructors
    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    // Getters and Setters
    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }


    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.10;
    }

    @Override
   public String toString() {
        return getName() + " - $ " + String.format("%.2f", payment());
   }
}
