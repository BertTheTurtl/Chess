import java.util.ArrayList;

public class Chess
{
    private Piece[][] board;
    private Player white;
    private Player black;

    public Chess(Player white, Player black)
    {
        this.white = white;
        this.black = black;
        board = new Piece[][]{
                {new Rook(w),new Knight(w),new Bishop(w),new Queen(w),new King(w),new Bishop(w),new Knight(w),new Rook(w)},
                {new Pawn(w),new Pawn(w),new Pawn(w),new Pawn(w),new Pawn(w),new Pawn(w),new Pawn(w),new Pawn(w)},
                {new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace()},
                {new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace()},
                {new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace()},
                {new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace(),new EmptySpace()},
                {new Pawn(b),new Pawn(b),new Pawn(b),new Pawn(b),new Pawn(b),new Pawn(b),new Pawn(b),new Pawn(b)},
                {new Rook(b),new Knight(b),new Bishop(b),new Queen(b),new King(b),new Bishop(b),new Knight(b),new Rook(b)}
        };
    }

    public boolean checkWin(Player player)
    {
        Player enemy;
        if (this.white.equals(player))
            enemy = black;
        else
            enemy = white;

        return /*!ENEMY'S KING.canMove()*/
    }
}
