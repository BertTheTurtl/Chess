import java.util.ArrayList;

public abstract class Piece
{
    private char color;
    private char type;

    public abstract ArrayList<Chess> moves(Chess board, Piece piece);

    public abstract boolean canMove(Chess board, Piece piece, int row, char column);

    public abstract boolean canEat(Chess board, Piece piece, int row, char column);
}
