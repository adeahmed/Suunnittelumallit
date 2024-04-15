package Prototype;

public class Main {

    public static void main(String[] args) {
        System.out.println("_______________Syväkopio_______________________________________");
        Kello kello = new Kello(12, 0);
        kello.tulostaAika();

        Kello kopio = kello.clone();
        kopio.tulostaAika();

        kello.asetaAika(13, 30);
        kello.tulostaAika();
        kopio.tulostaAika();

        System.out.println("__________________Matalakopio____________________________________");
        MatalakopioKello matalakopioKello = new MatalakopioKello(12, 20);
        matalakopioKello.tulostaAika();

        MatalakopioKello matalakopioKopio = matalakopioKello.clone();
        matalakopioKopio.tulostaAika();

        matalakopioKello.asetaAika(13, 30);
        matalakopioKello.tulostaAika();
        matalakopioKopio.tulostaAika();
    }
}

