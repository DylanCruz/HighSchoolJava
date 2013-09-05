
/**
 * Figures out demensions of a room.
 * 
 * @author Dylan Cruz 
 * @version 1.0 (9/27/11)
 */
public class dimensions
{
   
    private double height;
    private double length;
    private double width;

    /**
     * Constructor for objects of class dimensions
     */
    public dimensions(double h, double l, double w)
    {
        // initialise instance variables
       height = h;
       length = l;
       width = w;
    }

    /**
     * Calculates the volume.
     */
    public void volume()
    {
        // put your code here
        double v = length * width * height;
        System.out.println("The volume of this room is: " + v);
    }
    
    /**
     * Calculates the surface area.
     */
    public void surfaceArea()
    {
        // put your code here
        double sA = length * width + 2 * length * height + 2 * width * height;
        System.out.println("The surface area of this room is: " + sA);
    }

}

