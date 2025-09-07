package TicTacToe;

import java.util.Scanner;

public class Game {
    private final Board board;
    private final  Player player1;
    private final Player player2;
    private Player currentPlayer;

    public Game(Player player1, Player player2, Board board, Player currentPlayer) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.currentPlayer = currentPlayer;
    }

    public void startGame() {
        Scanner input = new Scanner(System.in);
        while(true) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + ": " + " Enter your row and column");
            int row = input.nextInt();
            int column = input.nextInt();
            boolean move = board.placeMove(new Move(row, column, currentPlayer));
            if (!move) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + ": " + " Invalid move");
                continue;
            }
            if (board.checkWin(currentPlayer)) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            switchTurn();
        }

        input.close();
    }

    private void switchTurn() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}
