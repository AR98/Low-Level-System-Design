package TicTacToe;

public class Main {
    public static void main(String[] args) {
        Player p1 = PlayerFactory.createPlayer(1, "sam", 'X');
        Player p2 = PlayerFactory.createPlayer(2, "lolo", 'O');

        Board b = new Board(3);

        Game game = new Game(p1,p2,b,p1);

        game.startGame();
    }
}
