package Composite;

public class Komponentti implements Laite {
    private String nimi;
    private double hinta;

    public Komponentti(String nimi, double hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public void tulosta() {
        System.out.println(nimi + ", Hinta: " + hinta);
    }

    public double haeHinta() {
        return hinta;
    }
}
