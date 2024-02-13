package Decorator;

public class Kana extends Dekoraatttori {
    public Kana(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return super.getDescription() + ", kana , BBQ-kastike";
    }
    public double getCost() {
        return super.getCost() + 10.0;
    }
}

