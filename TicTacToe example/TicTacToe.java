import java.util.ArrayList;

/**
 *
 * @author Samuel Prudencio
 */
public class TicTacToe
{
    /**
     *
     */
    private char[][] board;
    /**
     *
     */
    private Player x;
    /**
     *
     */
    private Player o;

    /**
     *
     * @param x
     * @param o
     */
    public TicTacToe(Player x, Player o)
    {
        this.x = x;
        this.o = o;
        board = new char[][]{{'_','_','_'},{'_','_','_'},{'_','_','_'}};
    }

    /**
     *
     * @return
     */
    public int countBlanks()
    {
        int count = 0;
        for(char[] cl : board)
        {
            for(char ch : cl)
            {
                if (ch == '_')
                    count++;
            }
        }
        return count;
    }

    /**
     *
     * @param player
     * @return
     */
    public char markerForPlayer(Player player)
    {
        if (player.equals(x))
            return 'X';
        else if (player.equals(o))
            return 'O';
        else
            return '_';
    }

    //Check state methods
    /**
     *
     * @param player
     * @return
     */
    public boolean checkWin(Player player)
    {
        char marker = markerForPlayer(player);
        String line = "";
        String winCondition = "" +marker +marker +marker;

        //Left column
        line = "" +board[0][0] +board[1][0] +board[2][0];
        if (line.equals(winCondition))
            return true;

        //Middle column
        line = "" +board[0][1] +board[1][1] +board[2][1];
        if (line.equals(winCondition))
            return true;

        //Right column
        line = "" +board[0][2] +board[1][2] +board[2][2];
        if (line.equals(winCondition))
            return true;

        //Top row
        line = "" +board[0][0] +board[0][1] +board[0][2];
        if (line.equals(winCondition))
            return true;

        //Middle row
        line = "" +board[1][0] +board[1][1] +board[1][2];
        if (line.equals(winCondition))
            return true;

        //Bottom row
        line = "" +board[2][0] +board[2][1] +board[2][2];
        if (line.equals(winCondition))
            return true;

        //Top left to bottom right diagonal
        line = "" +board[0][0] +board[1][1] +board[2][2];
        if (line.equals(winCondition))
            return true;

        //Top right to bottom left diagonal
        line = "" +board[0][2] +board[1][1] +board[2][0];
        if (line.equals(winCondition))
            return true;
        //If no win condition is found, then return false
        return false;
    }

    /**
     *
     * @param player
     * @return
     */
    public boolean checkLose(Player player)
    {
        if (markerForPlayer(player) == 'X')
            return checkWin(o);
        else if (markerForPlayer(player) == 'O')
            return checkWin(x);
        else
            return false;
    }

    /**
     *
     * @return
     */
    public boolean checkDraw()
    {
        return !checkWin(x) && !checkWin(o) && possibleMoves(x).equals(new ArrayList<>());
    }

    /**
     *
     * @param player
     * @return
     */
    public ArrayList<TicTacToe> possibleMoves(Player player)
    {
        ArrayList<TicTacToe> result = new ArrayList<>();
        char[][] possibleMove = new char[3][3];

        for (int j = 0; j < 3; j++)
        {
            for (int k = 0; k < 3; k++)
            {
                //Setting possibleMove to current board & create new instance
                possibleMove = new char[3][3];
                for (int l = 0; l < 3; l++)
                {
                    for (int m = 0; m < 3; m++)
                    {
                        possibleMove[l][m] = board[l][m];
                    }
                }

                if (board[j][k] == '_')
                {
                    TicTacToe addition = new TicTacToe(getX(), getO());
                    possibleMove[j][k] = markerForPlayer(player);
                    addition.setBoard(possibleMove);
                    result.add(addition);
                }
            }
        }

        return result;
    }

    //Getter methods
    /**
     *
     * @return
     */
    public char[][] getBoard()
    {
        return board;
    }

    /**
     *
     * @return
     */
    public Player getX()
    {
        return x;
    }

    /**
     *
     * @return
     */
    public Player getO()
    {
        return o;
    }

    //Setter methods
    /**
     *
     * @param newBoard
     */
    public void setBoard(char[][] newBoard)
    {
        board = newBoard;
    }

    /**
     *
     * @param newX
     */
    public void setX(Player newX)
    {
        x = newX;
    }

    /**
     *
     * @param newO
     */
    public void setO(Player newO)
    {
        o = newO;
    }

    /**
     *
     * @return
     */
    public String toString()
    {
        return "" +board[0][0] +board[0][1] +board[0][2] +"\n" +board[1][0] +board[1][1] +board[1][2] +"\n" +board[2][0] +board[2][1] +board[2][2] +"\n";
    }
}
