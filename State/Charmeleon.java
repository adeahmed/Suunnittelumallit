package State;

public class Charmeleon  implements PokemonState {
    public void attack() {
        System.out.println("Charmeleon used Fire Fang!");
    }

    public void defend() {
        System.out.println("Charmeleon used Smokescreen!");
    }

    public void run() {
        System.out.println("Charmeleon ran away!");
    }
    public void evolve(Pokemon pokemon) {
        if (pokemon.getXp() >= 32) {
            System.out.println("Charmeleon is evolving!");
            pokemon.setState(new Charizard());
        }
    }

}
