import java.util.Random;

public class RandomBoard {
    public static void main(String[] args) {
        int[] board = new int[100]; // Create an array to hold 100 random numbers
        Random random = new Random();

        // Fill the board with random numbers
        for (int i = 0; i < 100; i++) {
            board[i] = random.nextInt(1000); // You can change the range as needed
        }

        // Find and print the first and last numbers
        int firstNumber = board[0];
        int lastNumber = board[99];

        System.out.println("Generated Board:");
        printBoard(board);
        System.out.println("\nFirst Number on the Board: " + firstNumber);
        System.out.println("Last Number on the Board: " + lastNumber);
    }

    // Helper method to print the board
    public static void printBoard(int[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 10 == 0) { // Print a new line every 10 numbers
                System.out.println();
            }
        }
    }
}