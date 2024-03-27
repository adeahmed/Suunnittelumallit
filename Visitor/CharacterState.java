package Visitor;

interface CharacterState {
    void accept(BonusVisitor visitor, Character character);
}
