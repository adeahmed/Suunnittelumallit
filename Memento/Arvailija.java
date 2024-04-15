package Memento;


class Arvailija extends Thread {
    private Arvuuttaja arvuuttaja;

    public Arvailija(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        Memento memento = arvuuttaja.liityPeliin();
        int arvaus = -1;
        while (!arvuuttaja.arvaus(memento, arvaus)) {
            arvaus = (int) (Math.random() * 100); // Arpoo uuden arvauksen.
            System.out.println(Thread.currentThread().getName() + " arvaa: " + arvaus);
        }
        System.out.println(Thread.currentThread().getName() + " voitti!");
    }
}
