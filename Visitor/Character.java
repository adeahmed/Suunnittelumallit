package Visitor;

class Character {
    private CharacterState state;
    private int bonusPoints = 0;

    public Character(CharacterState state) {
        this.state = state;
    }

    public void addBonus(int points) {
        this.bonusPoints += points;
    }

    public int getBonusPoints() {
        return this.bonusPoints;
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void accept(BonusVisitor visitor) {
        state.accept(visitor, this);
    }
}
