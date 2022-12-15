public abstract class Player
{
    public abstract Chess chooseMove(Chess board);

    public double boardValue(Chess board)
    {
        if (board.checkWin(this))
            return 1.0;
        if (board.checkLose(this))
            return -1.0;
        return 0.0;
    }
}
