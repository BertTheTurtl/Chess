import java.util.ArrayList;

public class Pawn extends Piece
{
    public Pawn(char color)
    {
        super(color, 'P');
    }

    public ArrayList<Chess> moves(Chess board, int row, int column)
    {
        ArrayList<Chess> moveList = new ArrayList<>();

        if (this.getColor() == 'w')
        {
            Piece[][] copy = copyOfBoard(board);
            //Opening move
            if (row == 1 && copy[3][column].equals(new EmptySpace()))
            {
                copy[1][column] = new EmptySpace();
                copy[3][column] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            copy = copyOfBoard(board);
            //Move one space forward
            if (copy[row + 1][column].equals(new EmptySpace()) && row + 1 < 7)
            {
                copy[row][column] = new EmptySpace();
                copy[row + 1][column] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            /*Eating a piece*/
            //Left


            //Right


            /*Promotion*/
            //By going forward


            //By eating left


            //By eating right


            /*En passant*/
            //Left


            //Right


        } else if (this.getColor() == 'b')
        {
            Piece[][] copy = super.copyOfBoard(board);

            //Opening move
            if (row == 6 && copy[4][column].equals(new EmptySpace()))
            {
                copy[6][column] = new EmptySpace();
                copy[4][column] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            copy = copyOfBoard(board);
            //Move one space forward
            if (copy[row - 1][column].equals(new EmptySpace()) && row - 1 > 0)
            {
                copy[row][column] = new EmptySpace();
                copy[row - 1][column] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            /*Eating a piece*/
            //Left


            //Right


            /*Promotion*/
            //By going forward


            //By eating left


            //By eating right


            /*En passant*/
            //Left


            //Right


        }

        return moveList;
    }
}
