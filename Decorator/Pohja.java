package Decorator;

public class Pohja implements Pizza {

    @Override
    public String getDescription() {
        return "Pohja";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}