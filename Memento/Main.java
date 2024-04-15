package Memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        for (int i = 0; i < 3; i++) { // Luodaan 3
            new Arvailija(arvuuttaja).start();
        }
    }
}
