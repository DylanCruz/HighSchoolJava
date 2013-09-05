
/**
 * Does the coolest of all sorts - selection sort.
 * 
 * @author Dylan Cruz 
 * @version 1.0(12/19/11)
 */
public class selectionSort
{
    public void main()
    {
        System.out.print("\f");
        int [] x = new int [5];
        x[0] = 5;
        x[1] = 2;
        x[2] = 1;
        x[3] = -4;
        x[4] = 7;
        
        System.out.println("Original Array:");
        for(int q = 0; q < x.length; q++)
            System.out.print(x[q] + " ");
            
        selectionSort(x);
        
        System.out.println("");
        
        System.out.println("Array Sorted:");
        for(int q = 0; q < x.length; q++)
            System.out.print(x[q] + " ");
        
        System.out.println("");    
            
        String [] z = new String [5];
        z[0] = "dylan";
        z[1] = "peter";
        z[2] = "jared";
        z[3] = "anna";
        z[4] = "tom";
        
        System.out.println("String Array:");
        for(int q = 0; q < z.length; q++)
            System.out.print(z[q] + " ");
            
        selectionSortString(z);
        
        System.out.println("");
        
        System.out.println("String Array Sorted:");
        for(int q = 0; q < x.length; q++)
            System.out.print(z[q] + " ");
    }

    public static void selectionSort(int [] x)
    {
        for (int i = 0; i < x.length; i++)
        {
            int minIndex = i;       //Index of smallest remaining value
            for(int j = i + 1; j < x.length; j++)
                if(x[minIndex] > x[j])
                    minIndex = j;   // Remember index of new minimum
            
            if(minIndex != i)
            {
                //... Exchange current element with smallest remaining.
                int temp = x[i];
                x[i] = x[minIndex];
                x[minIndex] = temp;
            }
        }
    }

	public static void selectionSortString(String[] z)
	{
		for (int i = 0; i < z.length; i++) {
			int s = i;     // find the index of the smallest value
			for (int j = i; j < z.length; j++) 
				if (z[j].compareTo(z[s]) < 0) 
					s = j;
			// swap the smallest value into entry i-1
			String temp = z[i];
			z[i] = z[s];
			z[s] = temp;
		}
	}
}
