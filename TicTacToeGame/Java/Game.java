package eecs1022.lab6;

/**
 * Created by user on 3/24/18.
 */
public class Game
{
    final static int ROWS = 3;
    final static int COLUMNS = 3;
    final static int FINAL_TURN = 9;

    final char dot = '.';
    final static char X = 'X';
    final static  char O = 'O';
    boolean xTurn;

    char[][] board;
    String playerX;
    String playerO;
    String playFirst;

    int rowNum;
    int columnNum;

    boolean error;
    String errorMsg;
    String resultMsg;


    void setResult(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    void setError(String errorMsg) {
        this.error = true;
        this.errorMsg = errorMsg;
    }

    void resetError() {
        this.error = false;
        this.errorMsg = "";
    }

    Game() {
        error = false;
        errorMsg = "";
    }

    void players(String playerX, String playerO) {
        this.playerX = playerX;
        this.playerO = playerO;

    }

    void playFirst(String playFirst) {
        this.playFirst = playFirst;

    }

    void rowAndColumn(int rowNum, int columnNum) {
        this.rowNum = rowNum;
        this.columnNum = columnNum;
    }

    void intGameState() {

        board = new char[ROWS][COLUMNS]; //3 x 3 grid

        for (int row = 0; row < board.length; row++) // row: 0, 1, and 2 < 3
        {
            for (int col = 0; col < board[row].length; col++) //column: 0, 1, and 2 < 3
            {
                board[row][col] = dot;  // 3 x 3 grid is set with dots
            }
        }

        if (playFirst.equals("Player x")) {
            xTurn = true;
            setResult("Next player to play: " + this.playerX);
        } else if (playFirst.equals("Player o")) {
            xTurn = false; // Player o's turn
            setResult("Next player to play: " + this.playerO);
        } // determines who takes the first turn
    }

    public void playerMoves() {

        if (isWinner() || boardFull()) {
                setError("Error: Game is already over.");
        } else {
            if (board[rowNum - 1][columnNum - 1] != dot) {
                setError("Error: slot @ (" + rowNum + "," + columnNum + ") already occupied. \n"); //spot already taken
            } else {
                if (xTurn) { //Player x's turn
                    board[rowNum - 1][columnNum - 1] = X;
                    setResult("Next player to play: " + this.playerO);

                } else {      //Player o's turn
                    board[rowNum - 1][columnNum - 1] = O;
                    setResult("Next player to play: " + this.playerX);
                }
                xTurn = !xTurn;
                resetError();
            }
        }
    }


    String getGrid() {
        String grid = "";
        for (int row = 0; row < board.length; row++) {
            grid += board[row][0] + "      " + board[row][1] + "      " + board[row][2] + "\n";

        }
        return grid;
    }

    private boolean symbol(char s1, char s2, char s3){

        boolean symbol;

        symbol = ((s1 != dot) && (s1 == s2) && (s2 == s3));
        return symbol;
    }


    private boolean isHorizontal(){
        for(int r = 0; r < board.length; r++){
            if (symbol(board[r][0], board[r][1], board[r][2])){
                return true;
            }
        }

        return false;
    }


    private boolean isVertical(){

        for (int c = 0; c < board.length; c++){
            if (symbol(board[0][c], board[1][c], board[2][c])){
                return true;
            }
        }
        return  false;
    }

    private boolean isDiagonal(){
        return ((symbol(board[0][0], board[1][1], board[2][2])) || (symbol(board[0][2], board[1][1], board[2][0])));
    }


    public  boolean isWinner(){
        boolean winner;

        winner = isHorizontal() || isDiagonal() || isVertical();
        return winner;
    }

    public boolean boardFull()  {

        int spotsFilled = 0;
        for(int r = 0; r < 3; r++)  {
            for(int c = 0; c < 3; c++)  {
                if(board[r][c] == X || board[r][c] == O)
                    spotsFilled++;
            }
        }
        boolean lastTurn = spotsFilled == FINAL_TURN;

        return lastTurn;
    }

    public void allResults(){

        if (isWinner() && !boardFull()) {
            if (!xTurn) {
                setResult("Game is over with " + this.playerX + " being the winner");
            } else {
                setResult("Game is over with " + this.playerO + " being the winner");
            }
        } else if (!isWinner() && boardFull()) {
            setResult("Game is over with a tie between " + this.playerX + " and " + this.playerO);
        }
        else if (isWinner() && boardFull()){
            if (!xTurn) {
                setResult("Game is over with " + this.playerX + " being the winner");
            } else {
                setResult("Game is over with " + this.playerO + " being the winner");
            }
        }
    }



    @Override
    public String toString() {
        String s = "";
        if (error) {
            s += this.errorMsg + "\n";
        } else {
            resetError();
            s += "";
        }
        s += "Current Game Status: \n";

        // GRID HERE.
        s += getGrid();

        s += this.resultMsg;

        return s;
    }
}
