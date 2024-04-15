package Singleton;

public class ProductFactory {

    public static class ProductA implements Product {
        @Override
        public void use() {
            System.out.println("Using Product A");
        }
    }


    public static class ProductB implements Product {
        @Override
        public void use() {
            System.out.println("Using Product B");
        }
    }
}
