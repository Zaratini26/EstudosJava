package aulateste_employees.entities;

public class Employee {

    // Attributes
    private String name;
    private Integer hours;
    Double valuePerHour;

    // Constructors
    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    // Methods
    public double payment() {
        return hours * valuePerHour;
    }

    @Override
    public String toString() {
        return getName() + " - $ " + String.format("%.2f", payment());
    }

}
