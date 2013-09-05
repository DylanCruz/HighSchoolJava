import java.util.Scanner;
/**
 * Duh main game yo!
 * 
 * @author Dylan Cruz
 * @version 1.0
 */
public class MainGame
{
    public static void main(String [] args)
    {
        System.out.println("\f");
        Scanner scan = new Scanner(System.in);
        int h;
        String str;
        RPSGame human = new RPSGame();
        
        String playAgain = "Y";
        while(playAgain.equals("Y") || playAgain.equals("y"))
        {
            h = human.humanTakesTurn();
            if(h == 4)
            {
                human.reset();
                System.out.println("Resetting the game...");
            }
            else
                human.play(h);
            System.out.println("Play again? Type y for yes or n for no.");
            playAgain = scan.next();
        }
        str = human.getGameResults();
        System.out.println(str);
        
        str = human.getOveralGameStatus();
        System.out.println(str);
    }
}
