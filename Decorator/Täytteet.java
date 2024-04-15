
package Decorator;
abstract class Täytteet implements Pizza {
    protected Pizza koristeltavaPizza;

    public Täytteet(Pizza koristeltavaPizza) {
        this.koristeltavaPizza = koristeltavaPizza;
    }

    public String getDescription() {
        return koristeltavaPizza.getDescription();
    }

    public double getCost() {
        return koristeltavaPizza.getCost();
    }
}