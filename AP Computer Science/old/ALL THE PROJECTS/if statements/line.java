import java.util.Scanner;
/**
 * Write a description of class line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class line
{
    

    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        char firstLetterLast = 'B';
        
        if(firstLetterLast < 'H')
            System.out.println("Line 1");
        else if(firstLetterLast < 'P')
             System.out.println("Line 2");
        else
            System.out.println("Line 3");
        
    }
}
