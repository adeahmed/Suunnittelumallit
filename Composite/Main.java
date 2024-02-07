package Composite;

public class Main {
    public static void main(String[] args) {
        Tehdas tehdas = new PC();

        // Luodaan laiteosat
        Laite emolevy = tehdas.luoEmolevy();
        Laite prosessori = tehdas.luoProsessori();
        Laite naytonohjain = tehdas.luoNaytonohjain();
        Laite muistipiiri = tehdas.luoMuistipiiri();
        Laite verkkokortti = tehdas.luoVerkkokortti();
        Laite kotelo = tehdas.luoKotelo();
        System.out.println("Oma PC-kokoonpano:");
        System.out.println("-------------------------------------");

        // Tulostetaan laiteosat
        emolevy.tulosta();
        prosessori.tulosta();
        naytonohjain.tulosta();
        muistipiiri.tulosta();
        muistipiiri.tulosta();
        verkkokortti.tulosta();
        kotelo.tulosta();

        double kokoonpanonHinta = emolevy.haeHinta() + prosessori.haeHinta() + naytonohjain.haeHinta() + muistipiiri.haeHinta() + verkkokortti.haeHinta() + kotelo.haeHinta() + muistipiiri.haeHinta();
        System.out.println("-------------------------------------");

        System.out.println("Tietokoneen hinta: " + kokoonpanonHinta);
    }
}
