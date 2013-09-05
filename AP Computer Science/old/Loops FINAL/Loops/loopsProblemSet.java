
/**
 * loopsProblemSet
 * 
 * @author Jared Heller
 * @version 10/26/11
 */
import java.util.Random;
public class loopsProblemSet
{
    
    /**
     * Constructor for objects of class loopsProblemSet
     */
    public loopsProblemSet()
    {      
    }

    /**
     * #1 Mulitplication table      
     */
    public void multTable(int num)
    {
        
        System.out.println("\fThe multiplication table for "+num);
        for (int i=1; i<13; i++)
        {
            System.out.println("\t"+i+" times "+num+" = "+num*i);
        }
    }
    
    /**
     * #7 Coin Toss
     */
    public void coinToss()
    {
        Random gen = new Random();
        int heads=0, tails=0, num;
        
        for (int i=0; i<1000; i++)
        {
            num=gen.nextInt(2);
            if (num==0)
                heads++;
            else
                tails++;            
        }
        System.out.println("\fOut of 1000 coin toss, there were "+heads+" heads, and "+tails+" tails.");
    }
    
    /**
     * #6 Lotto
     */
    public void lotto()
    {
        Random gen = new Random();
        int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;
        
        for (int i=0; i<6; i++)
        {
            num1=gen.nextInt(59)+1;
            num2=gen.nextInt(59)+1;
            num3=gen.nextInt(59)+1;
            num4=gen.nextInt(59)+1;
            num5=gen.nextInt(59)+1;
            num6=gen.nextInt(59)+1;
        }
        System.out.println("\fYour numbers are "+num1+", "+num2+", "+num3+", "+num4+", "+num5+", and "+num6);
        
    }   
    
    /**
     * #8 Two fair dice rolled 1000 times.  Count how many sevens.
     */
    public void dice()
    {
        Random gen = new Random();
        int num7=0, side1=0, side2=0;
        
        for (int i=0; i<1000; i++)
        {
            side1=gen.nextInt(6)+1;
            side2=gen.nextInt(6)+1;            
            if (side1+side2==7)
                num7++;       
        }
        System.out.println("\fOut of 1000 rolls of 2 fair dice, the number 7 was rolled "+num7+" times");
    }
    
    /**
     * #9 perfect number
     */
   
    
  
}        
