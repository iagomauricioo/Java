package entities;

public class CurrencyCalculator {
    double dollar;
    double quantity;

    public double transform(double dollar, double quantity) {
        quantity += quantity * 6/100;
        return dollar * quantity;
    }
}
