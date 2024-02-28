package TemplateMethod;
public abstract class Game {
    protected int player1Score = 0;
    protected int player2Score = 0;
    protected int currentPlayer = 1;
    protected int targetScore;

    public Game(int targetScore) {
        this.targetScore = targetScore;
    }

    protected abstract void initializeGame();
    protected abstract void playTurn();
    protected abstract boolean isGameOver();
    protected abstract void printWinner();

    // Template method
    public final void playOneGame() {
        initializeGame();
        while (!isGameOver()) {
            playTurn();
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }
        printWinner();
    }
}
