package Command;

public class Main {
    public static void main(String[] args){
        Valkokangas valkokangas = new Valkokangas();
        Command switchUp = new FlipUpCommand(valkokangas);
        Command switchDown = new FlipDownCommand(valkokangas);
        WallButton button1 = new WallButton(switchUp);
        WallButton button2 = new WallButton(switchDown);

        System.out.println("Huomio!!!");
        System.out.println("Button3 ja Buntton4 ovat vain harjoituksia ei koske tehtävänantoa!!! ");
        WallButton button3 = new WallButton((Command) () -> System.out.println("Valkokangas sivulle"));
        WallButton button4 = new WallButton(new Command() {
            @Override
            public void execute() {
                System.out.println("Valkokangas korsoon");
            }
        });
        button1.push();
        button2.push();
        button3.push();
        button4.push();

    }
}
