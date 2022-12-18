import java.util.ArrayList;

public class EmptySpace extends Piece
{
    public EmptySpace()
    {
        super('_', '_');
    }

    public ArrayList<Chess> moves(Chess board, int row, int column)
    {
        return new ArrayList<>();
    }
}
