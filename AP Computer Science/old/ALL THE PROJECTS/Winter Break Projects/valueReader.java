import java.io.*;
import java.util.Scanner;
/**
 * Reads values and does other stuff.
 * 
 * @author Dylan Cruz           
 * @version 1.0 (12/27/11)
 */
public class valueReader
{
    public static void main(String [] args) throws FileNotFoundException
    {
    int oneToTen = 0;
    int elevToTwen = 0;
    int twenOneToThir = 0;
    int thirOneToFour = 0;
    int fourOneToFive = 0;
    int fiveOneToSix = 0;
    int sixOneToSev = 0;
    int sevOneToEight = 0;
    int eightOneToNine = 0;
    int nineOneToHun = 0;  
        
    File aFile = new File("F:\\values.txt");
    Scanner scan = new Scanner(new FileReader(aFile));
    int [] counts = new int[]{0,0,0,0,0,0,0,0,0,0};
    int value = 0;
        while(scan.hasNext() && value != 999)
    {
        value = scan.nextInt();
        if(value > 0 && value < 11)
            oneToTen++;
        
        if(value > 10 && value < 21)
            elevToTwen++;
            
        if(value > 20 && value < 31)
            twenOneToThir++;
            
        if(value > 30 && value < 41)
            thirOneToFour++;
            
        if(value > 40 && value < 51)
            fourOneToFive++;
            
        if(value > 50 && value < 61)
            fiveOneToSix++;
            
        if(value > 60 && value < 71)
            sixOneToSev++;
            
        if(value > 70 && value < 81)
            sevOneToEight++;
            
        if(value > 80 && value < 91)
            eightOneToNine++;
            
        if(value > 90 && value < 101)
            nineOneToHun++;
        
    }
    
    System.out.print("#s between 1 and 10   |");
        for(int i = 1; i <= oneToTen/5; i++)
            System.out.print(" *");
    System.out.println("");
        
    System.out.print("#s between 11 and 20  |");
        for(int i = 1; i <= elevToTwen/5; i++)
            System.out.print(" *");
    System.out.println("");
    
    System.out.print("#s between 21 and 30  |");
        for(int i = 1; i <= twenOneToThir/5; i++)
            System.out.print(" *");
    System.out.println("");
    
    System.out.print("#s between 31 and 40  |");
        for(int i = 1; i <= thirOneToFour/5; i++)
            System.out.print(" *");
    System.out.println("");
    
    System.out.print("#s between 41 and 50  |");
        for(int i = 1; i <= fourOneToFive/5; i++)
            System.out.print(" *");
    System.out.println("");
    
    System.out.print("#s between 51 and 60  |");
        for(int i = 1; i <= fiveOneToSix/5; i++)
            System.out.print(" *");
    System.out.println("");
    
    System.out.print("#s between 61 and 70  |");
        for(int i = 1; i <= sixOneToSev/5; i++)
            System.out.print(" *");
    System.out.println("");
    
    System.out.print("#s between 71 and 80  |");
        for(int i = 1; i <= sevOneToEight/5; i++)
            System.out.print(" *");
    System.out.println("");
    
    System.out.print("#s between 81 and 90  |");
        for(int i = 1; i <= eightOneToNine/5; i++)
            System.out.print(" *");
    System.out.println("");
    
    System.out.print("#s between 91 and 100 |");
        for(int i = 1; i <= nineOneToHun/5; i++)
            System.out.print(" *");
    System.out.println("");
}
}
