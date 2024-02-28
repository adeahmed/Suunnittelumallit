package TemplateMethod;

import java.util.Random;

import java.util.Random;

public class DiceGame extends Game {
    private Random random = new Random();

    public DiceGame() {
        super(20);
    }

    @Override
    protected void initializeGame() {
        System.out.println("Tervetuloa noppapeliin! Ensimmäinen pelaaja, joka saavuttaa 20 pistettä, voittaa.");
        player1Score = 0;
        player2Score = 0;
    }

    @Override
    protected void playTurn() {
        int roll = random.nextInt(6) + 1; // Heittää noppaa, tulokset 1-6
        if (currentPlayer == 1) {
            player1Score += roll;
            System.out.println("Pelaaja 1 heitti " + roll + ". Kokonaispisteesi on nyt " + player1Score + ".");
        } else {
            player2Score += roll;
            System.out.println("Pelaaja 2 heitti " + roll + ". Kokonaispisteesi on nyt " + player2Score + ".");
        }
    }

    @Override
    protected boolean isGameOver() {
        return player1Score >= targetScore || player2Score >= targetScore;
    }

    @Override
    protected void printWinner() {
        if (player1Score >= targetScore) {
            System.out.println("Pelaaja 1 saavutti ensimmäisenä 20 pistettä ja voitti pelin!");
        } else {
            System.out.println("Pelaaja 2 saavutti ensimmäisenä 20 pistettä ja voitti pelin!");
        }
    }
}
