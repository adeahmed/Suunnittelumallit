package State;
public class Pokemon {
    private PokemonState state;
    private int xp = 0;

    public Pokemon() {
        state = new Charmander();
    }

    public void setState(PokemonState state) {
        this.state = state;
    }

    public void attack() {
        state.attack();
        kasvataXp();
    }

    public void defend() {
        state.defend();
        kasvataXp();
    }

    public void run() {
        state.run();
        kasvataXp();
    }

    private void kasvataXp() {
        xp++;
        System.out.println("XP increased to " + xp);
        state.evolve(this);
    }
    public int getXp() {
        return xp;
    }

}




