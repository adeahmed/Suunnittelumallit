
package Prototype;
class Kello implements Cloneable {
    private Viisari tuntiViisari;
    private Viisari minuuttiViisari;

    public Kello(int tunti, int minuutti) {
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
    public Kello clone() {
        try {
            Kello kopio = (Kello) super.clone();
            kopio.tuntiViisari = tuntiViisari.clone();
            kopio.minuuttiViisari = minuuttiViisari.clone();
            return kopio;
        } catch (CloneNotSupportedException e) {
            // Cloneable-tuen puuttuminen ei tulisi tapahtua, mutta käsittellään se silti
            e.printStackTrace();
            return null;
        }
    }
}