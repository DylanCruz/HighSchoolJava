import java.util.Scanner;
/**
 * finds a name in an array of strings
 * 
 * @Dylan Cruz
 * @1.0 (12/12/11)
 */
public class findName
{
    public void main()
    {
        String [] names = {"Bobby", "Rachel", "Matt", "Krystal", "Millie", "Andrew", "dylan"};
        
        int index = findNames(names);
        
        if(index != -1)
            System.out.println(names[index]);
        else
            System.out.println("Name not found.");
    }

    /**
     * Find Names.
     */
    public int findNames(String [] n)
    {
        int i = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter the name you wish to find.");
        String name = keyboard.next();
        
        for(i = 0; i < n.length; i++)
        {
            if(n[i].equals(name))
                break;
        }
        if(i == n.length)
            return -1;
        
        return i;
    }
}
