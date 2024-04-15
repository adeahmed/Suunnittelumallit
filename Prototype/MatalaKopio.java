package Prototype;



class MatalaKopio implements Cloneable {
    private Viisari tuntiViisari;
    private Viisari minuuttiViisari;

    public MatalaKopio(int tunti, int minuutti) {
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
    public MatalaKopio clone() {
        try {
            MatalaKopio kopio = (MatalaKopio) super.clone();

            return kopio;
        } catch (CloneNotSupportedException e) {
            // Cloneable-tuen puuttuminen ei tulisi tapahtua, mutta käsittellään se silti
            e.printStackTrace();
            return null;
        }
    }
}