import java.util.*;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public String listToString()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("i");
        list.add("n");
        list.add("o");
        list.add("t");
        list.add("e");
        list.add("b");
        list.add("i");
        list.add("n");
        list.add("d");
        list.add("o");
        int start = 6;
        int end = 7;
        String answer = new String();
        for(int k = start; k <= end; k++)
            answer += list.get(k);
        return answer;
    }
}
