package Visitor;


public class Main {
    public static void main(String[] args) {
        Character character = new Character(new HealthyState());
        System.out.println("Hahmon alku bonuspisteet: " + character.getBonusPoints());
        BonusDistributor bonusDistributor = new BonusDistributor();
        character.accept(bonusDistributor);
        System.out.println("Hahmon bonuspisteet terveenä ollessa: " + character.getBonusPoints());
        character.setState(new InjuredState());
        character.accept(bonusDistributor);
        System.out.println("Hahmon bonuspisteet loukkaantuneena ollessa: " + character.getBonusPoints());
    }
}

