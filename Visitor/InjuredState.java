package Visitor;

class InjuredState implements CharacterState {
    public void accept(BonusVisitor visitor, Character character) {
        visitor.visit(this, character);
    }
}