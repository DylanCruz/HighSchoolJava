
/**
 * Write a description of class distance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class distance
{
    // instance variables - replace the example below with your own
    double pointX;
    double pointY;
    

    /**
     * Constructor for objects of class distance
     */
    public distance(double pX, double pY)
    {
        pointX = pX;
        pointY = pY;
        
    }

    /**
     * Find the distance between two points using the distance forumula.
     */
    public void distanceFormula()
    {
        double distance;
        
        distance = Math.sqrt(Math.pow(pointX - 0,2) + Math.pow(pointY - 0,2));
        
        System.out.println("The distance from the origin is " + distance);
    }
}
