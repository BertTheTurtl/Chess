import java.util.ArrayList;

/**
 *
 * @author Samuel Prudencio
 */
public class AIPlayer extends Player
{
    /**
     *
     */
    private String name;
    /**
     *
     */
    private Player opponent;

    /**
     *
     * @param name
     * @param opponent
     */
    public AIPlayer(String name, Player opponent)
    {
        this.name = name;
        this.opponent = opponent;
    }

    /**
     *
     * @param board
     * @return
     */
    public TicTacToe chooseMove(TicTacToe board)
    {
        ArrayList<TicTacToe> possibleMoves = board.possibleMoves(this);
        TicTacToe bestMove = new TicTacToe(board.getX(), board.getO());
        double highestValue = -999.9;

        for (TicTacToe move : possibleMoves)
        {
            double comparison = minValue(move);
            if (comparison > highestValue)
            {
                highestValue = comparison;
                bestMove = move;
            }
        }

        return bestMove;
    }

    /**
     *
     * @param board
     * @return
     */
    public double minValue(TicTacToe board)
    {
        if (board.checkWin(this))
            return 1.0;
        else if (board.checkLose(this))
            return -1.0;
        else if (board.checkDraw())
            return 0.0;
        else
        {
            ArrayList<TicTacToe> possible;
            if (board.getX() == this)
                possible = board.possibleMoves(board.getO());
            else
                possible = board.possibleMoves(board.getX());
            double lowestValue = 999.9;
            for (TicTacToe move : possible)
            {
                double comparison = maxValue(move);
                if (comparison < lowestValue)
                    lowestValue = comparison;
            }
            return lowestValue;
        }
    }

    /**
     *
     * @param board
     * @return
     */
    public double maxValue(TicTacToe board)
    {
        if (board.checkWin(this))
            return 1.0;
        else if (board.checkLose(this))
            return -1.0;
        else if (board.checkDraw())
            return 0.0;
        else
        {
            ArrayList<TicTacToe> possible = board.possibleMoves(this);
            double highestValue = -999.9;
            for (TicTacToe move : possible)
            {
                double comparison = minValue(move);
                if (comparison > highestValue)
                    highestValue = comparison;
            }
            return highestValue;
        }
    }

    /**
     *
     * @param board
     * @return
     */
    public double boardValue(TicTacToe board)
    {
        return maxValue(board);
    }

    /**
     *
     * @return
     */
    public Player getOpponent()
    {
        return opponent;
    }

    /**
     *
     * @param player
     */
    public void setOpponent(Player player)
    {
        opponent = player;
    }

    /**
     *
     * @return
     */
    public String toString()
    {
       return "" +name +" (AI)";
    }
}
