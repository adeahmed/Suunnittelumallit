package Prototype;

class MatalakopioKello  implements Cloneable {
    private Viisari tuntiViisari;
    private Viisari minuuttiViisari;

    public MatalakopioKello(int tunti, int minuutti) {
        this.tuntiViisari = new Viisari(tunti);
        this.minuuttiViisari = new Viisari(minuutti);
    }

    public void asetaAika(int tunti, int minuutti) {
        tuntiViisari.setArvo(tunti);
        minuuttiViisari.setArvo(minuutti);
    }

    public void tulostaAika() {
        System.out.println("Kello on " + tuntiViisari.getArvo() + ":" + minuuttiViisari.getArvo());
    }

    @Override
    public MatalakopioKello clone() {
        try {
            MatalakopioKello kopio = (MatalakopioKello) super.clone();

            return kopio;
        } catch (CloneNotSupportedException e) {
            // Cloneable-tuen puuttuminen ei tulisi tapahtua, mutta käsittellään se silti
            e.printStackTrace();
            return null;
        }
    }
}