package primeiroprojeto.generics.exemplo02generics.entities;

public class Product implements Comparable<Product>{

    // Attributes
    private String name;
    private Double price;

    // Constructors
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Methods
    @Override
    public String toString(){
        return name + ", $" + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }
}
