import java.util.Random;

public class TicTacToe {
    // Game State Variables
    static char player1Symbol;
    static char player2Symbol;
    static String currentPlayer;

    public static void main(String[] args) {
        performToss();
        
        System.out.println("Toss Result:");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("First turn goes to: " + currentPlayer);
    }

    public static void performToss() {
        Random rand = new Random();
        // Generates 0 or 1
        int toss = rand.nextInt(2);

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = "Player 1";
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = "Player 2";
        }
    }
}