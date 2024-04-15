package State;

public class Charmander implements PokemonState {


    public void attack() {
        System.out.println("Charmander used Ember!");
    }


    public void defend() {
        System.out.println("Charmander used Smokescreen!");
    }

    public void run() {
        System.out.println("Charmander ran away!");
    }


    public void evolve(Pokemon pokemon) {
        if (pokemon.getXp() >= 16) {
            System.out.println("Charmander is evolving to Charmeleon!");
            pokemon.setState(new Charmeleon());
        }
    }
}