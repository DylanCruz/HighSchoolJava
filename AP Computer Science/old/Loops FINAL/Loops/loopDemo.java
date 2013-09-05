
/**
 * loopDemo
 * 
 * @author Jared Heller 
 * @version 10/25/11
 */
import java.util.Scanner;
public class loopDemo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class loopDemo
     */
    public loopDemo()
    {
        
    }

    /**
     * An example of for and while loops
     *    
     */
    public void example()
    {
        Scanner keyboard = new Scanner(System.in);
        int num, sum=0, i;   
        for (i=0; i<5; i++)
        {
            System.out.print("Please enter an integer from 0 to 100: ");
            num = keyboard.nextInt();
            while (num<0 || num>100)//error checking
            {
                System.out.print("Illegal input.  Please enter an integer from 0 to 100: ");
                num = keyboard.nextInt();
            }
            sum = num + sum;
        }
        System.out.println("The average of the five numbers is: " + (double)sum/5); //can also do sum/5.0
        
    }
    
    public void whileExample()
    {
        Scanner keyboard = new Scanner(System.in);
        int num, i, sum=0;
        System.out.print("\f");
        i = 0;
        while(i<5)
        {
            System.out.print("Please enter an integer from 0 to 100: ");
            num  = keyboard.nextInt();
            while (num<0 || num>100)//error checking
            {
                System.out.print("Illegal input.  Please enter an integer from 0 to 100: ");
                num = keyboard.nextInt();
            }
            sum = sum+num;
            i++;
        }
        System.out.println("The average of the five numbers is: " + (double)sum/5); //can also do sum/5.0
    }
    
    public void userInput()
    {
        Scanner keyboard = new Scanner(System.in);
        int num, sum=0, totalNum=0;
        
        System.out.print("\fPlease enter an integer from 0 to 100 or 999 to end: ");//999 is sentinal value
        num  = keyboard.nextInt();
        while ((num!=999) && (num<0 || num>100))//error checking
            {
                System.out.print("Illegal input.  Please enter an integer from 0 to 100: ");
                num = keyboard.nextInt();
            }
        while (num!=999)
        {
            sum = sum+num;//keeping a sum of all numbers
            totalNum++;
            System.out.print("Please enter an integer from 0 to 100 or 999 to end: ");//999 is sentinal value
            num  = keyboard.nextInt();
            while ((num!=999) && (num<0 || num>100))//error checking
            {
                System.out.print("Illegal input.  Please enter an integer from 0 to 100: ");
                num = keyboard.nextInt();
            }
        }
        if (totalNum>0)        
            System.out.println("The average of the "+totalNum+" numbers is "+(double)sum/totalNum);
        else
            System.out.println("No numbers were entered.");       
                 
    }   
    
}
