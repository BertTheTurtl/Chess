/**
 *
 * @author Samuel Prudencio
 */
public abstract class Player
{
    /**
     *
     * @param board
     * @return
     */
    public abstract TicTacToe chooseMove(TicTacToe board);

    /**
     *
     * @param board
     * @return
     */
    public double boardValue(TicTacToe board)
    {
        if (board.checkWin(this))
            return 1.0;
        if (board.checkLose(this))
            return -1.0;
        return 0.0;
    }
}
