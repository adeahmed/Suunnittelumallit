package State;

public class Main {
    public static void main(String[] args) {
    Pokemon pokemon = new Pokemon();

        for (int i = 0; i < 40; i++) {
        pokemon.attack();
        if (i % 4 == 0) {
            pokemon.defend();
        }
        if (i % 10 == 0) {
            pokemon.run();
        }
    }
}
}

