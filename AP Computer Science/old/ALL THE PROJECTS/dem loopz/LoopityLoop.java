import java.util.Scanner;
/**
 * Write a description of class LoopityLoop here.
 * 
 * @author Dylan Cruz   
 * @version 1.0 (10/25/11)
 */
public class LoopityLoop
{
    
    /**
     * Examples of for / while loops.
     */
    public void forEx()
    {
        Scanner keyboard = new Scanner(System.in);
        int num,sum=0,i;
        
        for(i=0;i<5;i++)
        {
            System.out.print("Please enter an integer from 0 - 100: ");
            num = keyboard.nextInt();
            while(num<0||num>100)
            {
                System.out.print("ILLEGAL INPUT, Please enter an integer from 0 - 100:  ");
                num = keyboard.nextInt();
            }
            sum = num + sum;
        }
        System.out.println("The average of the 5 numbers is: " + (double)sum/5);
    }
    
    public void whileEx()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("/f");
        int num, i, sum=0;
        i = 0;
        while(i<5)
        {
            System.out.print("Please enter an integer from 0 - 100: ");
            num = keyboard.nextInt();
            while(num<0||num>100)
            {
                System.out.print("ILLEGAL INPUT, Please enter an integer from 0 - 100:  ");
                num = keyboard.nextInt();
            }
            sum = num + sum;
            i++;
        }
        System.out.println("The average of the 5 numbers is: " + (double)sum/5);
    }

    public void userInput()
    {
        Scanner keyboard = new Scanner(System.in);
        int num, sum=0, totalNum=0;
        System.out.print("\f");
        System.out.print("Please enter an integer from 0 - 100, or 999 to end: "); //999 in sentinel value
        num = keyboard.nextInt();
        while((num!=999) && (num<0||num>100))
            {
                System.out.print("ILLEGAL INPUT, Please enter an integer from 0 - 100:  ");
                num = keyboard.nextInt();
            }
        while(num != 999)//when 999 typed, it ends the loop
        {
            sum = sum + num;//Keeping a sum of all numbers
            totalNum++;
            System.out.print("Please enter an integer from 0 - 100, or 999 to end: "); //999 in sentinel value
            num = keyboard.nextInt();
            while((num!=999) && (num<0||num>100))
            {
                System.out.print("ILLEGAL INPUT, Please enter an integer from 0 - 100:  ");
                num = keyboard.nextInt();
            }
        }
        if(totalNum>0)
            System.out.println("The average of the " + totalNum + " numbers is " + (double)sum/totalNum);
        else
            System.out.println("No numbers were entered.");
        
    }
    
    public void multiTables()
    {
        
    }
}
