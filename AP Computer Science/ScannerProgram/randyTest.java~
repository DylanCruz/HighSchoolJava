import java.util.Random;
/**
 * Tests if you're a randy. If you are, your pc will explode.
 * 
 * @author Dylan Cruz
 * @version 1.0 (10/6/11)
 */
public class randyTest
{
    public static void main(String [] args)
    {
        System.out.println('\f'); //Clear screen
        Random gen = new Random();
        int num = gen.nextInt(6); //Random number from 0-5
        double dub = gen.nextDouble(); //Number [0,1)
        
        System.out.println("Num = " + num);
        System.out.println("Dub = " + dub);
        
        //random number from min to max val
        int min = 15;
        int max = 50;
        
        num = gen.nextInt(max - min + 1);
        num = num + min;
        System.out.println("Number between 15 and 50 = " + num);
    }
}
