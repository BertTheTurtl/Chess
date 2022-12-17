import java.util.ArrayList;

public abstract class Piece
{
    private final char color;
    private final char type;

    public Piece(char color, char type)
    {
        this.color = color;
        this.type = type;
    }

    public abstract ArrayList<Chess> moves(Chess board, int row, int column);

    public boolean canMove(Chess board, int row, int column)
    {
        return moves(board, row, column).size() > 0;
    }

    public abstract boolean canEat(Chess board, int rowOfPiece, int columnOfPiece, int rowOfTarget, int columnOfTarget);

    //Getter methods

    //Setter methods

    public String toString()
    {
        return "" +color +type;
    }
}
