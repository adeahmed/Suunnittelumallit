package Decorator;

public class Dekoraatttori implements Pizza{
    private Pizza pizza;
    public Dekoraatttori(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription();
    }
    public double getCost() {
        return pizza.getCost();
    }
}
