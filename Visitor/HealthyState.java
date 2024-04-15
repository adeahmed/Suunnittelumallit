package Visitor;

class HealthyState implements CharacterState {
    public void accept(BonusVisitor visitor, Character character) {
        visitor.visit(this, character);
    }
}