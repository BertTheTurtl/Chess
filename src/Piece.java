import java.util.ArrayList;

public abstract class Piece
{
    private char color;
    private char type;

    public abstract ArrayList<Chess> moves(Chess board, int row, char column);

    public boolean canMove(Chess board, int row, char column)
    {
        return moves(board, row, column).size() > 0;
    }

    public abstract boolean canEat(Chess board, Piece piece, int row, char column);

    public String toString()
    {
        return "" +color +type;
    }
}
