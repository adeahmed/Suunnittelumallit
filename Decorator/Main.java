package Decorator;

public class Main {

    Pizza pizza = new Pohja();

    public static void main(String[] args) {
        Pizza pizza = new Margarita(new Pohja());
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());


        Pizza pizza2 = new Kana(new Margarita(new Pohja()));
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getCost());
    }


}

