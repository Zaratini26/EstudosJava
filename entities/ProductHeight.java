package entities;

public class ProductHeight {
    // Attributes
    private String name;
    private int age;
    private double height;

    // Construction
    public ProductHeight(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}