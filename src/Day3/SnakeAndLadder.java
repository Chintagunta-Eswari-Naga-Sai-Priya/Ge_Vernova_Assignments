package Day3;
// SnakeAndLadder.java
import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");

        int[] positions = {0, 0}; // Positions for two players
        int currentPlayer = 0; // Track current player
        int diceRolls = 0;
        Random random = new Random();

        while (positions[0] < 100 && positions[1] < 100) {
            int die = random.nextInt(6) + 1; // Roll the die (1 to 6)
            diceRolls++;
            System.out.println("Player " + (currentPlayer + 1) + " rolled: " + die);

            int option = random.nextInt(3); // 0: No Play, 1: Ladder, 2: Snake

            switch (option) {
                case 0:
                    System.out.println("No Play. Player " + (currentPlayer + 1) + " stays in the same position.");
                    break;
                case 1:
                    positions[currentPlayer] += die;
                    if (positions[currentPlayer] > 100) {
                        positions[currentPlayer] -= die; // Stay in the same position if exceeds 100
                    }
                    System.out.println("Player " + (currentPlayer + 1) + " climbed the ladder to position: " + positions[currentPlayer]);
                    currentPlayer = (currentPlayer + 1) % 2; // Switch player
                    break;
                case 2:
                    positions[currentPlayer] -= die;
                    if (positions[currentPlayer] < 0) {
                        positions[currentPlayer] = 0; // Restart from 0 if below
                    }
                    System.out.println("Player " + (currentPlayer + 1) + " was bitten by a snake and moved to position: " + positions[currentPlayer]);
                    currentPlayer = (currentPlayer + 1) % 2; // Switch player
                    break;
            }
        }

        if (positions[0] >= 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
        System.out.println("Total dice rolls: " + diceRolls);
    }
}
