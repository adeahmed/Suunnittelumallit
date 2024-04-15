package Builder;

import java.util.ArrayList;

public class HesburgerBuilder implements BurgerBuilder {
    private ArrayList<Object> osat = new ArrayList<Object>();
    public void lisääSalaatti() {
        osat.add(new JäävuoriSalaatti());
    }

    public void lisääJuusto() {
        osat.add(new Juusto());
    }

    public void lisääPihvi() {
        osat.add(new Pihvi());
    }

    public void lisääSämpylä() {
        osat.add(new Sämpylä());
    }

    public Object getBurger() {
        return osat;
    }
}



