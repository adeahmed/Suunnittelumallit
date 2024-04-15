package Prototype;

class Viisari implements Cloneable {
    private int arvo;

    public Viisari(int arvo) {
        this.arvo = arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return arvo;
    }

    @Override
    public Viisari clone() {
        try {
            return (Viisari) super.clone();
        } catch (CloneNotSupportedException e) {
            // Cloneable-tuen puuttuminen ei tulisi tapahtua, mutta käsittellään se silti
            e.printStackTrace();
            return null;
        }
    }
}