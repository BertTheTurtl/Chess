import java.util.ArrayList;

public class Horse extends Piece
{
    public Horse(char color)
    {
        super(color, 'H');
    }

    //Remember to stay in bounds
    public ArrayList<Chess> moves(Chess board, int row, int column)
    {
        //Variable set-up
        ArrayList<Chess> moveList = new ArrayList<>();
        Piece[][] copy = super.copyOfBoard(board);

        /*Two up*/
        //One right
        if (row + 2 <= 7)
        {
            if (column + 1 <= 7)
            {

            }

            if (column - 1 >= 0)
            {

            }
            /*copy[row][column] = new EmptySpace();
            copy[][] = this;

            Chess newMove = new Chess(board.getWhite(), board.getBlack());
            newMove.setBoard(copy);
            moveList.add(newMove);*/
        }

        //One left

        /*Two down*/
        //One right

        //One left

        /*Two right*/
        //One up

        //One down

        /*Two left*/
        //One up

        //One down


        return moveList;
    }
}
