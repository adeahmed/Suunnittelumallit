package Singleton;

public class Main {
    public static void main(String[] args) {
        Tehdas factory = Singleton.getInstance();
        Product productA = factory.createProduct("A");
        productA.use();

        Product productB = factory.createProduct("B");
        productB.use();
    }
}
