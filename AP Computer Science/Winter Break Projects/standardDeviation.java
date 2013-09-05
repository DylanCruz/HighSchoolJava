import java.util.Scanner;
import java.lang.Math;
/**
 * Enter numbers, recieve standard deviation.
 * 
 * @author Dylan Cruz
 * @version 1.0 (12/28/11)
 */
public class standardDeviation
{
    public void main()
    {
        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        int [] array = new int[100];
        int i = 0;
        int count = -1;  
        System.out.println("Please enter your numbers, type 999 to finish.");  
        for(i = 0; i < array.length; i++)
        {
            array[i] = scan.nextInt();
            count++;
            if(array[i] == 999)
                break;
        }           
        System.out.println("You entered " + count + " numbers."); 
        int [] newArray = new int[count];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        calcStDev(newArray);
    }

    public void calcStDev(int [] newArray)
    {
       double avg = 0;
       int sum = 0;
       double temp = 0;
       double sdSum = 0;
       double sd = 0;
       for(int k = 0; k < newArray.length; k++)
		  sum = sum + newArray[k];
	   avg = (double)sum / newArray.length;
	   for(int z = 0; z < newArray.length; z++)
	   {
	       temp = ((newArray[z] - avg)*(newArray[z] - avg));
	       sdSum = sdSum + temp;
	   }
	   sdSum = sdSum / newArray.length;
	   sd = Math.sqrt(sdSum);
	   System.out.println("The standard deviation of the given numbers is " + sd);
    }
}