package Visitor;

interface BonusVisitor {
    void visit(HealthyState state, Character character);
    void visit(InjuredState state, Character character);
}

