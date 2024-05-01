package Command;

public class FlipDownCommand implements Command {
    private Valkokangas valkokangas;
    public FlipDownCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }
    @Override // Command
    public void execute() {
        valkokangas.alas();
    }
}
