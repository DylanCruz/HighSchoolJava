import java.util.Scanner;
/**
 * The game of the century. Rock Paper Scissors: The Game
 * 
 * @author Dylan Cruz
 * @version 1.0
 */
public class RPSGame
{
    //instance variablez
    private int mySelection;
    private int computerWins;
    private int humanWins;
    private int ties;
    private int plays;
    
    /**
     * Constructor for objects of class RPSGame
     */
    public RPSGame()
    {
        plays = 0;
        ties = 0;
        humanWins = 0;
        computerWins = 0;
        mySelection = 0;
    }

    /**
     * Resets game stats.
     */
    public void reset()
    {
        plays = 0;
        ties = 0;
        humanWins = 0;
        computerWins = 0;
    }

    /**
     * Returns the number of times the computer has won.
     */
    public int getComputerWins()
    {
        return computerWins;
    }

    /**
     * Returns the number of times the inferior human has won.
     */
    public int getHumanWins()
    {
        return humanWins;
    }

    public int getTies()
    {
        return ties;
    }

    /**
     * humanTakesTurn - this method will give a menu for the user:
     *  Choose:
     *      (1) rock
     *      (2) paper
     *      (3) scissors
     *      (4) reset game
     *  Please enter 1, 2, 3 or 4:
     *  
     *  this method uses the scanner class to allow the user to input something
     */
    public int humanTakesTurn()
    {
        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors: The Game");
        System.out.println("Please Choose:");
        System.out.println("(1) The Rockin' Rock");
        System.out.println("(2) The Powerful Paper");
        System.out.println("(3) The Sharp Scissors");
        System.out.println("(4) Reset");
        mySelection = scan.nextInt();
      
        while(mySelection < 1 || mySelection > 4)
        {
            if(mySelection == 3223)
            {
                System.out.println("You entered the secret password! Yay! You get 999 wins!");
                humanWins = 999;
            }
            
            System.out.println("Please choose a valid number.");
            mySelection = scan.nextInt();
        }
        
        return mySelection;
    }

    /**
     * play game - input parameters
     * @param :     h = human choice ( 1 = rock, 2 = paper, 3 = scissors)
     * 
     * This method will instantiate a computer object and invoke the computerTakesTurnMethod
     * then check if human or computer won or is it a tie -- keep track of game stats
     */
    public void play(int h)
    {
        h = mySelection;
        randomHelper rand = new randomHelper();
        int c = rand.computerTakesTurn();
        
        if(h==1 && c==3)
            humanWins++;
        if(h==1 && c==2)
            computerWins++;
        
        if(h==2 && c==3)
            computerWins++;
        if(h==2 && c==1)
            humanWins++;
        
        if(h==3 && c==2)
            humanWins++;
        if(h==3 && c==1)
            computerWins++;
        
        if(h==c)
            ties++;
        plays++;
    }

    /**
     * getGameResults
     * @param - outputs string reflecting how the human did against the computer.
     */
    public String getGameResults()
    {
        String results = "Human Wins " + humanWins + "\nComputer Wins " + computerWins + "\nTies " + ties + "\nTotal Plays " + plays;;
        return results;
    }
    
    /**
     * getOveralGameStatus
     * @param - outputs string reflecting how the human did against the computer.
     */
    public String getOveralGameStatus()
    {
        String status;
        int stat = humanWins - computerWins;
        if(stat >= 5)
            status = "You're the new king of Rock Paper Scissor: The Game. Congratulations.";
        else if(stat >=1 && stat <= 4)
            status = "You're on the way to become the best. Keep it up.";
        else if(stat == 0)
            status = "You're even with the computer, you can do this!";
        else if(stat <= -1 && stat >= -4)
            status = "You're in the red right now. You must do better!";
        else
            status = "You're a dissapointment.";
        return status;
    }
}