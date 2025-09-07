package TicTacToe;

public class PlayerFactory {
    public static Player createPlayer(int id, String name, char symbol) {
        return new Player(id, name, symbol);
    }
}
