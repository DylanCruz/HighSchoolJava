
/**
 * Write a description of class change here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class change
{
    // instance variables - replace the example below with your own
    int original;

    /**
     * Constructor for objects of class change
     */
    public change(int og)
    {
        // initialise instance variables
        original = og;
    }

    /**
     * Finds the change 
     */
    public void calcChange()
    {
        // put your code here
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int newPrice1;
        int newPrice2;
        int newPrice3;
        
        quarters = original / 25;
        newPrice1 = original - quarters * 25; 
        dimes = newPrice1 / 10;
        newPrice2 = newPrice1 - dimes * 10;
        nickels = newPrice2 / 5;
        newPrice3 = newPrice2 - nickels * 5;
        pennies = newPrice3 / 1;
        
        System.out.println(quarters + " quarters.");
        System.out.println(dimes + " dimes.");
        System.out.println(nickels + " nickels.");
        System.out.println(pennies + " pennies.");
    }
}
