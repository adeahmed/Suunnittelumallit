package Memento;

public class Arvuuttaja {
    public Memento liityPeliin() {
        int arvattuLuku = (int) (Math.random() * 100); // Arpoo luvun 0-99 väliltä.
        return new Memento(arvattuLuku);
    }

    public boolean arvaus(Memento memento, int arvaus) {
        return memento.getArvattuLuku() == arvaus;
    }
}
