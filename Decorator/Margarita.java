package Decorator;

public class Margarita extends Dekoraatttori {
    public Margarita(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return super.getDescription() + ", tomaattikastike, juusto";
    }
    public double getCost() {
        return super.getCost() + 5.0;
    }
}

