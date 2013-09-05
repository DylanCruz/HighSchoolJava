
/**
 * Write a description of class binarySearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class binarySearch
{
    public void main()
    {
        System.out.print("\f");
        int [] x = new int [6];
        x[0] = 5;
        x[1] = 2;
        x[2] = 1;
        x[3] = -4;
        x[4] = 7;
        
        System.out.println("Original Array:");
        for(int q = 0; q < x.length; q++)
            System.out.print(x[q] + " ");
            
        binarySort(x, 3);
    }

    public int binarySort(int [] x, int target)
    {
        int low = 0;
        int high = x.length - 1;
        int middle = (low + high) / 2;
        while(x[middle] != target && low <= high)
        {
            if(target < x[middle])
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low + high) / 2;
        }
        if(x[middle] == target)
            return middle;
        else
            return -1;
    }
}
