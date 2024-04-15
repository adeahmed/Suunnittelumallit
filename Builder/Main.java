package Builder;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        HampurilaisenRakentaja rakentaja = new HampurilaisenRakentaja();

        // Rakennetaan Hesburger-hampurilainen
        rakentaja.setBurgerBuilder(new HesburgerBuilder());
        rakentaja.rakennaHampurilainen();
        List<Object> hesburgerBurger = (List<Object>) rakentaja.getBurger();
        System.out.println("Hesburger-hampurilainen osat:");
        for (Object osa : hesburgerBurger) {
            System.out.println("- " + osa.getClass().getSimpleName());
        }

        // Rakennetaan McDonald's-hampurilainen
        rakentaja.setBurgerBuilder(new McDonaldsBuilder());
        rakentaja.rakennaHampurilainen();
        String mcDonaldsBurger = (String) rakentaja.getBurger();
        System.out.println("_______________________________________________");
        System.out.println("\nMcDonald's-hampurilainen:\n" + mcDonaldsBurger);
    }
}
