package entities;

public class EmployeeRegistration {

    // Attributes
    private Integer id;
    private String name;
    private Double salary;

    // Constructor
    public EmployeeRegistration(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    // metodos
    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", $ " + String.format("%.2f", salary);
    }
}

