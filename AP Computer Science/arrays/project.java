
/**
 * Array project.
 * 
 * @author Dylan Cruz
 * @version 1.0 (12/14/11)
 */
public class project
{
    public void main()
    {
        System.out.print("\f");
        
        //array initialization
        int [] a = new int [5];
        a[0] = 1;
        a[1] = 3;
        a[2] = 0;
        a[3] = 2;
        a[4] = 0;
        
        //Prints array a
        System.out.print("The array a is ");
        for(int z = 0; z < a.length; z++)
            System.out.print(a[z] + " ");
        
        System.out.println("");
        
        //Set Zero
        int z = findZero(a,0);
        System.out.println("The location of zero in array a at the position provided is " + z);
        
        //setZero Beginning
        System.out.println("");
        System.out.println("Beginning setZero.");
        int f = findZero(a,0);
        int s = findZero(a,f+1);
        if(f == -1 || s == -1) //if findZero returns a -1, it means a 0 
            System.out.println("There is only one zero in the array, or the zeroes are next to each other.");
        else
            {
                System.out.println("The locations of the zeroes are at " + f + " and " + s);
                setZero(a, f, s);
            }
        
        //Prints array a
        System.out.print("The array a is ");
        for(z = 0; z < a.length; z++)
            System.out.print(a[z] + " ");
    }

    /**
     * findZero - returns the index of the occurence of zero of an array, -1 if not found.
     * @param input - A: integer array - array of integers to search
     *                pos: integer of the position to start searching
     * @param output - int - index of zero or -1 if not found
     */
    public int findZero(int [] a, int pos)
    {
        int i = 0;
        
        for(i = pos; i < a.length; i++)
        {
            if(a[i] == 0)
                break;
        }
        
        if(i == a.length)
            return -1;
        
        return i;
    }

    /**
     * setZero - zeroes inbetween the zeroes to zero.
     * @param input - a: integer array - array of integers to search
     *                f: integer value of the index of the first zero
     *                s: integer value of the index of the second zero
     * @param output - nothing :(
     */
    public void setZero(int [] a, int f, int s)
    {
        for(int i = f; i <=s; i++)
            a[i]=0;  
    }
}
