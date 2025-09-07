package TicTacToe;

public class Board {
    private  final  int size;
    private  final  char[][] board;

    Board(int size) {
        this.size = size;
        board = new char[size][size];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                board[i][j] = '-';
            }
        }
    }

    public  boolean placeMove(Move move){
        if(move.getRow()<0 || move.getRow()>=size || move.getCol()<0 || move.getCol()>=size || board[move.getRow()][move.getCol()] != '-') return false;
        board[move.getRow()][move.getCol()] = move.getPlayer().getSymbol();
        return true;
    }

    public boolean isFull(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] != '-') return false;
            }
        }

        return true;
    }

    public boolean checkWin(Player player){
        // row check
        for(int i=0;i<size;i++){
            boolean win = true;
            for(int j=0;j<size;j++){
                if(board[i][j] != player.getSymbol()){
                    win = false;
                    break;
                }
            }

            if(win) return true;
        }

        //col check
        for(int i=0;i<size;i++){

            boolean win = true;
            for (int j=0;j<size;j++){
                if(board[j][i] != player.getSymbol()){
                    win = false;
                    break;
                }
            }

            if(win) return true;
        }

        // check diagonals
        boolean dig1=true, dig2=true;

        for(int i=0;i<size;i++){
           if(board[i][i] != player.getSymbol()) dig1 = false;
           if(board[i][size-i-1] != player.getSymbol()) dig2 = false;
        }

        return dig1 || dig2;
    }

    // Display board
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
