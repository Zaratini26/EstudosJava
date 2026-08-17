package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double calculationConversion(double price, double dollarAmount) {
        return price * dollarAmount;
    }

    public static double iofCalculation(double price, double dollarAmount) {
       return (price * dollarAmount) * IOF;
    }

    public static double totalConversionValue(double price, double dollarAmount) {
        return calculationConversion(price, dollarAmount) + iofCalculation(price, dollarAmount);
    }
}
