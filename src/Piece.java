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

    public Piece[][] copyOfBoard(Chess board)
    {
        Piece[][] copy = new Piece[8][8];
        for(int j = 0; j < 8; j++)
        {
            for(int k = 0; k < 8; k++)
            {
                copy[j][k] = board.getBoard()[j][k];
            }
        }
        return copy;
    }

    //Getter methods
    public char getColor()
    {
        return color;
    }

    public char getType()
    {
        return type;
    }

    public boolean equals(Object obj)
    {
        return toString().equals(obj.toString());
    }

    //toString()
    public String toString()
    {
        return "" +color +type;
    }
}
