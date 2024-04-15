package Builder;

public class McDonaldsBuilder implements BurgerBuilder {
    private StringBuilder burger = new StringBuilder();


    public void lisääSalaatti() {
        burger.append("Jäävuorisalaatti\n");
    }

    public void lisääJuusto() {
        burger.append("Juusto\n");
    }

    public void lisääPihvi() {
        burger.append("Pihvi\n");
    }

    public void lisääSämpylä() {
        burger.append("Sämpylä\n");
    }

    public Object getBurger() {
        return burger.toString();
    }


}
