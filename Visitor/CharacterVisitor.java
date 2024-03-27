package Visitor;

interface CharacterVisitor {
    void visitHealthy(Character character);
    void visitInjured(Character character);
}