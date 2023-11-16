package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double result = 0;
        if (getAnualIncome() < 20000) {
            result = getAnualIncome() * 15/100;
            if (healthExpenditures > 0) {
                result -= (healthExpenditures / 2);
            }
        }
        else {
            result = getAnualIncome() * 25/100;
            if (healthExpenditures > 0) {
                result -= (healthExpenditures / 2);
            }
        }
        return result;

    }
}
