
/**
 * Does stuff from today.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stuffLOL
{
    public void addToEnd()
    {
        int max = 10;
        int [] grades = new int [max];
        
        grades [0] = 100;
        grades [1] = 90;
        grades [2] = 85;
        int loglen = 3;
        int newGrade = 99;
        
        //add to end
        grades[loglen] = newGrade;
        loglen++;
        
        System.out.println("\f");
        for(int i = 0; i < loglen; i++)
            System.out.print(grades[i] + " ");
        System.out.println("");
    }

    public void addToStart()
    {
        int max = 10;
        int [] grades = new int [max];
        
        grades [0] = 100;
        grades [1] = 90;
        grades [2] = 85;
        int loglen = 3;
        int newGrade = 99;
        
        
        System.out.println("\f");
        for(int i = loglen;i>0;i--)
            System.out.print(grades[i] = grades[i-1]);
        System.out.println("");
    }

    public void doubleArray()
    {
        int [] grades = {1,2,3,4,5,6};
        
        for(int i = 0; i < grades.length; i++)
            System.out.print(grades[i] + " ");
           System.out.println(""); 
        int [] newGrades = new int [2*grades.length];
        
        for(int i = 0; i < grades.length; i++)
            newGrades[i] = grades [i];
            
        grades = newGrades;
        
        grades[10] = 99;
        
        for(int i = 0; i < grades.length; i++)
            System.out.print(grades[i] + " ");
        System.out.println("");
    }

    public void deleteFromArray()
    {
        int [] grades = {1,2,3,4,5,6};
        int i = 0;
        int q = 0;
        int del = 3;
        
        for(i = 0; i < grades.length; i++)
            System.out.print(grades[i] + " ");
        System.out.println("");
        
        //find value to delete
        for(i = 0; i < grades.length; i++)
        {
            if (grades[i]==del)
                break;
        }
        
        if(i == grades.length)
            return;
        
            for(q = i; q < grades.length; q++)
        {
            grades[q] = grades[q+1];
        }
    
        for(i = 0; i < grades.length; i++)
            System.out.print(grades[i] + " ");
        System.out.println("");
    }
}
