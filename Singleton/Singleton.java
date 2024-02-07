package Singleton;
public class Singleton implements Tehdas {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    public Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ProductFactory.ProductA();
            case "B":
                return new ProductFactory.ProductB();
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}
