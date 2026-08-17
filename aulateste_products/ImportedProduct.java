package aulateste_products;

public class ImportedProduct extends Product{

    // Attributes
    private Double customsFee;

    // Constructors
    public ImportedProduct() {}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    // Getters and Setters
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {}

    // Methods
    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", totalPrice()) +
                " (Custom fee: $ " + String.format("%.2f", customsFee) + ")";
    }

    public Double totalPrice() {
        return getPrice() + getCustomsFee();
    }
}
