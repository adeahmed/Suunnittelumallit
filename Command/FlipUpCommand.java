package Command;

/** The Command for turning on the light -
 ConcreteCommand #1 */
public class FlipUpCommand implements Command {
    private Valkokangas valkokangas;
    public FlipUpCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }
    @Override // Command
    public void execute() {
        valkokangas.ylös();
    }
}
