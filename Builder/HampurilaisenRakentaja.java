package Builder;

public class HampurilaisenRakentaja {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder builder) {
        burgerBuilder = builder;
    }

    public void rakennaHampurilainen() {
        burgerBuilder.lisääSalaatti();
        burgerBuilder.lisääJuusto();
        burgerBuilder.lisääPihvi();
        burgerBuilder.lisääSämpylä();
    }

    public Object getBurger() {
        return burgerBuilder.getBurger();
    }
}
