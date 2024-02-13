package State;

public class Charizard implements PokemonState {

    public void attack() {
        System.out.println("Charizard used Flamethrower!");
    }

    public void defend() {
        System.out.println("Charizard used Protect!");
    }

    public void run() {
        System.out.println("Charizard ran away!");
    }
    public void evolve(Pokemon pokemon) {
        System.out.println("Charizard can't evolve further!");
    }
}



