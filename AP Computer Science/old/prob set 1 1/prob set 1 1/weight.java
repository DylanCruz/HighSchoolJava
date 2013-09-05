
/**
 * Write a description of class weight here.
 * 
 * @author Dylan Cruz
 * @version 1.0 (9/27/11)
 */
public class weight
{
    // instance variables - replace the example below with your own
    private double weight;

    /**
     * Constructor for objects of class weight
     */
    public weight(double w)
    {
        // initialise instance variables
        weight = w;
    }

    /**
     * Converts pounds to kilograms
     */
    public void convertWeight()
    {
        double weightKG;
        
        weightKG = weight / 2.2;
        
        System.out.println("The weight " + weight + "lbs. is equal to " + weightKG + "kg.");
    }
}
