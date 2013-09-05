
/**
 * Nested Loop Program
 * 
 * @author Dylan Cruz
 * @version 10/31/11
 */
import java.util.Scanner;
public class nestedLoopsProblem
{   

    /**
     * Constructor for objects of class nestedLoopsProblem
     */
    public nestedLoopsProblem()
    {
        
    }       

    /**
     * #1 Square
     */
    public void printSquare(int n)
    {
        System.out.print("\f");
        for (int i=1;i<=n; i++)
        {
            for (int a=1;a<=n;a++)
            {
                System.out.print(a+" ");                
            }
            System.out.println();
            
        
        }
    }
    /**
     * #2 Box Part a
     */
    public void printColumns(int n)
    {
        System.out.print("\f");
        for (int i=1;i<=n;i++)
        {
            for (int a=1;a<=6;a++)
            {
                System.out.print("X");                
            }
            System.out.println();
        }
            
    }
    /**
     * #2 Box Part b
     */
    public void printRows(int n)
    {
        System.out.print("\f");
        for (int i=1;i<=6;i++)
        {
            for (int a=1;a<=n;a++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    /**
     * #2 Box Part c
     */
    public void printArea(int W, int L)
    {
        System.out.print("\f");
        for (int i=1;i<=L;i++)
        {
            for (int a=1;a<=W;a++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    /**
     * #4 Takes an int n and prints out the numbers from 1 through n diagonally
     */
    public void diagonal(int n)
    {
        System.out.print("\f");
        for (int i=1;i<=n;i++)
        {
            for (int a=1;a<i;a++)
            {
                System.out.print("_");
            }
            System.out.println(i);
        }
        
        }
        
    /**
     * #5 Application pointUp, pointDown, pointLeft, and pointRight
     */
    public void pointDown(int n)
    {        
        System.out.print("\f");
        if (n%2==0)
        {
            System.out.println("Invalid number");
            return;
        }
            
        for (int i=n;i>0;i-=2)
        {                       
            for (int a=((n-i)/2);a>0;a--)
            {
                System.out.print("-");                
            }
            
            for (int q=0;q<i;q++)
            {                
                System.out.print("#");
                
            }
            System.out.println();     
        }            
    }
    
    
    /**
     * PointUp
     */
    public void pointUp(int n)
    {
        System.out.print("\f");
        if (n%2==0)
        {
            System.out.println("Invalid number");
            return;
        }
        for (int i=n;i>=1;i-=2)        
        {
            for (int a=i;a>1;a-=2)
            {
                System.out.print("-");
            }
            
            for (int q=n;q>=i;q-=1)
            {
                System.out.print("#");
            }
            System.out.println();
         }
    }
    /**
     * PointLeft
     */
    public void pointLeft(int n)
    {
        System.out.print("\f");
        if (n%2==0)
        {
            System.out.println("Invalid number");
            return;
        }
        for (int i=n;i>=1;i-=2)        
        {
            for (int a=i;a>=2;a-=1)
            {
                System.out.print("-");
            }
            
            for (int q=n;q>=i;q-=1)
            {
                System.out.print("#");
            }
            System.out.println();
         } 
         
        for (int i=n;i>1;i-=2)        
        {
            for (int a=(n+1);a>=i;a--)
            {
                System.out.print("-");
            }

            for (int q=1;q<=(i-2);q++)
            {
                System.out.print("#");
            }
            System.out.println();
        } 
        
        }
    

    
        
/**
 * pointRight
 * 
 */

public void pointRight(int n)
{
    System.out.print("\f");
    System.out.print("\f");
    if (n%2==0)
        {
            System.out.println("Invalid number");
            return;
        }
        
            for(int i=n;i>=1;i-=2)
            {
                for (int q=n;q>=i;q--)
            {
                System.out.print("#");
            }
            System.out.println();
    }
    for(int i=n;i>=1;i-=2)
    {
        for(int q=(i-1);q>=2;q--)
            {
                System.out.print("#");
            }
            System.out.println();
    }

   }
  }
