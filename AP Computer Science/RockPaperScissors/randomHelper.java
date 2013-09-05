import java.util.Random;
/**
 * Helps random gen be random.
 * 
 * @author Dylan Cruz
 * @version 1.0
 */
public class randomHelper
{
    private int computerSelection;
    private Random gen = new Random();

    public randomHelper()
    {
        computerSelection = 1;
    }

    /**
     * ComputerTakesTurn : uses random generator to get a value 1, 2 or 3
     * @param - outputs computer choice 1 = rock, 2 = paper, 3 = scissors
     */
    public int computerTakesTurn()
    {
        computerSelection = gen.nextInt(3)+1;
        int c = computerSelection;
        return c;
    }
}
