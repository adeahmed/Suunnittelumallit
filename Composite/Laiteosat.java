package Composite;

public class Laiteosat {

    public static class Emolevy implements Laite {
        private double hinta;

        public Emolevy(double hinta) {
            this.hinta = hinta;
        }

        public void tulosta() {
            System.out.println("Emolevy, Hinta: " + hinta);
        }

        public double haeHinta() {
            return hinta;
        }
    }

    public static class Prosessori implements Laite {
        private double hinta;

        public Prosessori(double hinta) {
            this.hinta = hinta;
        }

        public void tulosta() {
            System.out.println("Prosessori, Hinta: " + hinta);
        }

        public double haeHinta() {
            return hinta;
        }
    }

    public static class Naytonohjain implements Laite {
        private double hinta;

        public Naytonohjain(double hinta) {
            this.hinta = hinta;
        }

        public void tulosta() {
            System.out.println("Näytönohjain, Hinta: " + hinta);
        }

        public double haeHinta() {
            return hinta;
        }
    }


    public static class Muistipiiri implements Laite {
        private double hinta;

        public Muistipiiri(double hinta) {
            this.hinta = hinta;
        }

        public void tulosta() {
            System.out.println("Muistipiiri, Hinta: " + hinta);
        }

        public double haeHinta() {
            return hinta;
        }
    }


    public static class Verkkokortti implements Laite {
        private double hinta;

        public Verkkokortti(double hinta) {
            this.hinta = hinta;
        }

        public void tulosta() {
            System.out.println("Verkkokortti, Hinta: " + hinta);
        }

        public double haeHinta() {
            return hinta;
        }
    }

    public static class Kotelo implements Laite {
        private double hinta;

        public Kotelo(double hinta) {
            this.hinta = hinta;
        }

        public void tulosta() {
            System.out.println("Kotelo, Hinta: " + hinta);
        }

        public double haeHinta() {
            return hinta;
        }
    }
}
