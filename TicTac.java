public class TicTacToe {
    public static void main(String[] args) {
        // 1. Create a 3x3 2D array
        char[][] board = new char[3][3];

        // 2. Initialize the board with '-'
        // Outer loop for rows
        for (int i = 0; i < 3; i++) {
            // Inner loop for columns
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // 3. Print the board to the console
        System.out.println("Empty Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            // New line after each row
            System.out.println();
        }
    }
}