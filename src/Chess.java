import java.util.ArrayList;

public class Chess
{
    private Piece[][] board;
    private Player white;
    private Player black;
    private boolean whiteCheck;
    private boolean blackCheck;

    public Chess(Player white, Player black)
    {
        this.white = white;
        this.black = black;
        board = new Piece[][]{
                {new Rook('w'),new Horse('w'),new Bishop('w'),new Queen('w'),new King('w'),new Bishop('w'),new Horse('w'),new Rook('w')},
                {new Pawn('w'),new Pawn('w'),new Pawn('w'),new Pawn('w'),new Pawn('w'),new Pawn('w'),new Pawn('w'),new Pawn('w')},
                {new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace()},
                {new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace()},
                {new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace()},
                {new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace()},
                {new Pawn('b'),new Pawn('b'),new Pawn('b'),new Pawn('b'),new Pawn('b'),new Pawn('b'),new Pawn('b'),new Pawn('b')},
                {new Rook('b'),new Horse('b'),new Bishop('b'),new Queen('b'),new King('b'),new Bishop('b'),new Horse('b'),new Rook('b')}
        };
    }

    public int countBlanks()
    {
        int count = 0;
        for (Piece[] pl : board)
        {
            for (Piece pc : pl)
            {
                if (pc.equals(new EmptySpace()))
                    count++;
            }
        }
        return count;
    }

    public char markerForPlayer(Player player)
    {
        if (player.equals(white))
            return 'w';
        else if (player.equals(black))
            return 'b';
        else
            return '_';
    }

    public boolean checkWin(Player player)
    {
        Player enemy;
        if (this.white.equals(player))
            enemy = black;
        else
            enemy = white;

        return /*!ENEMY'S KING.canMove() && is in check*/
    }

    public boolean checkLose(Player player)
    {
        return /*player's king has no legal moves && is in check*/
    }

    public boolean checkDraw()
    {
        return !checkWin(white) && !checkWin(black) && /*either king has no legal moves and is not in check*/;
    }

    public ArrayList<Chess> possibleMoves(Player player)
    {
        /*CHECK IF THE KING IS IN DANGER*/


        /*En passant*/


        //For checking the king
        //Arrays.asList(yourArray).contains(yourValue)

    }

    //Getter methods
    public Piece[][] getBoard()
    {
        return board;
    }

    public Player getWhite()
    {
        return white;
    }

    public Player getBlack()
    {
        return black;
    }

    //Setter methods
    public void setBoard(Piece[][] newBoard)
    {
        board = newBoard;
    }

    public void setWhite(Player newWhite)
    {
        white = newWhite;
    }

    public void setBlack(Player newBlack)
    {
        black = newBlack;
    }

    //toString()
    public String toString()
    {

    }
}
