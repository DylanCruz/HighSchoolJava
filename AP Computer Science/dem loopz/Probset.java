import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Probset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Probset
{
    /**
     * Does something with multiplication tables. #1
     */
    public void multiTables(int num)
    {
        System.out.println("\fThe multiplication table for " + num + " is: ");
        for(int i=1; i<=12; i++)
        {
            System.out.println("\t" + i + " times " + num + " = " + num*i);
        }
    }

    /**
     * Tosses a coin. #7
     */
    public void coinToss()
    {
        Random gen = new Random();
        int head=0, tail=0, num;
        for(int i=0;i<1000;i++)
        {
            num = gen.nextInt(2);
            if(num == 0)
                head++;
            else
                tail++;
        }
        System.out.println("\fAfter 1000 coin tosses, the coin landed on heads " + head + " times, and on tails " + tail + " times.");
    }

    /**
     * Hacks the lottery system and gets you tonights winning numbers... #6
     */
    public void lottery()
    {
        int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;
        Random gen = new Random();
        
        for(int i=0;i<6;i++)
        {
            num1 = gen.nextInt(59)+1;
            num2 = gen.nextInt(59)+1;
            num3 = gen.nextInt(59)+1;
            num4 = gen.nextInt(59)+1;
            num5 = gen.nextInt(59)+1;
            num6 = gen.nextInt(59)+1;
        }
        System.out.println("\fYour lucky numbers are " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", and " + num6);
    }    

    /**
     * Rolls 2 dice, checks how many times they equal 7. #7
     */
    public void dice()
    {
        int num7=0, side1=0, side2=0;
        Random gen = new Random();
        for(int i=0;i<1000;i++)
        {
            side1 = gen.nextInt(6)+1;
            side2 = gen.nextInt(6)+1;
            
            if(side1 + side2 == 7)
                num7++;
        }
        System.out.println("\fAfter 1000 rolls, 7 was rolled " + num7 + " times.");
    }

    public void perfectNum(int n)
    {
        System.out.print("Hi");      
    }
}
