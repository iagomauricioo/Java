package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {

        double result = 0;

        if (numberOfEmployees < 10) {
            result = getAnualIncome() * 16/100;
        }
        else {
            result = getAnualIncome() * 14/100;
        }

        return result;
    }
}
