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
            //Opening move
            Piece[][] copy = copyOfBoard(board);
            if (row == 1 && copy[3][column].equals(new EmptySpace()))
            {
                copy[1][column] = new EmptySpace();
                copy[3][column] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            //Move one space forward
            copy = copyOfBoard(board);
            if (row + 1 < 7 && copy[row + 1][column].equals(new EmptySpace()))
            {
                copy[row][column] = new EmptySpace();
                copy[row + 1][column] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            /*Eating a piece*/
            //Left
            copy = copyOfBoard(board);
            if (row + 1 < 7 && column - 1 >= 0 && !copy[row + 1][column - 1].equals(new EmptySpace()) && copy[row + 1][column - 1].getColor() == 'b')
            {
                copy[row][column] = new EmptySpace();
                copy[row + 1][column - 1] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            //Right
            copy = copyOfBoard(board);
            if (row + 1 < 7 && column + 1 <= 7 && !copy[row + 1][column + 1].equals(new EmptySpace()) && copy[row + 1][column + 1].getColor() == 'b')
            {
                copy[row][column] = new EmptySpace();
                copy[row + 1][column + 1] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            /*Promotion*/
            //By going forward


            //By eating left


            //By eating right


        } else if (this.getColor() == 'b')
        {
            //Opening move
            Piece[][] copy = super.copyOfBoard(board);
            if (row == 6 && copy[4][column].equals(new EmptySpace()))
            {
                copy[6][column] = new EmptySpace();
                copy[4][column] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            //Move one space forward
            copy = copyOfBoard(board);
            if (row - 1 > 0 && copy[row - 1][column].equals(new EmptySpace()))
            {
                copy[row][column] = new EmptySpace();
                copy[row - 1][column] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            /*Eating a piece*/
            //Left
            copy = copyOfBoard(board);
            if (row - 1 > 0 && column + 1 <= 7 && !copy[row - 1][column + 1].equals(new EmptySpace()) && copy[row - 1][column + 1].getColor() == 'w')
            {
                copy[row][column] = new EmptySpace();
                copy[row - 1][column + 1] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            //Right
            copy = copyOfBoard(board);
            if (row - 1 > 0 && column - 1 >= 0 && !copy[row - 1][column - 1].equals(new EmptySpace()) && copy[row - 1][column - 1].getColor() == 'w')
            {
                copy[row][column] = new EmptySpace();
                copy[row - 1][column - 1] = this;

                Chess newMove = new Chess(board.getWhite(), board.getBlack());
                newMove.setBoard(copy);
                moveList.add(newMove);
            }

            /*Promotion*/
            //By going forward


            //By eating left


            //By eating right


        }

        return moveList;
    }
}
