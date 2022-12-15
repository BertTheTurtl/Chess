import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Samuel Prudencio
 */
public class UserPlayer extends Player
{
    /**
     *
     */
    private String name;
    /**
     *
     */
    private Scanner input;

    /**
     *
     * @param name
     * @param input
     */
    public UserPlayer(Scanner input, String name)
    {
        this.name = name;
        this.input = input;
    }

    /**
     *
     * @param board
     * @return
     */
    public TicTacToe chooseMove(TicTacToe board)
    {
        System.out.println("Current board:\n" +board +"It is " +this.name +"'s turn!\n");

        ArrayList<TicTacToe> possibilities = board.possibleMoves(this);
        int moveSelect = 0;

        System.out.println("Here are all of the possible moves:");
        for (TicTacToe moves : possibilities)
        {
            System.out.println(moveSelect +"\n" +moves);
            moveSelect++;
        }

        System.out.print("Type in the number of the corresponding move you wish to make: ");
        moveSelect = input.nextInt();

        return possibilities.get(moveSelect);
    }

    /**
     *
     * @return
     */
    public String toString()
    {
       return name;
    }
}
