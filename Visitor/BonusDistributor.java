package Visitor;

class BonusDistributor implements BonusVisitor {
    public void visit(HealthyState state, Character character) {
        character.addBonus(10); // Oletetaan, että terveet hahmot saavat 10 bonuspistettä
    }

    public void visit(InjuredState state, Character character) {
        character.addBonus(5); // Oletetaan, että loukkaantuneet hahmot saavat 5 bonuspistettä
    }
}
