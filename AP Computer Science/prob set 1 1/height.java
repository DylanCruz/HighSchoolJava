
/**
 * Does some height conversions.
 * 
 * @author Dylan Cruz
 * @version 1.0 (9/27/11)
 */
public class height
{
    // instance variables - replace the example below with your own
    private double heightFeet;
    private double heightInch;

    /**
     * Constructor for objects of class height
     */
    public height(double hF, double hI)
    {
        // initialise instance variables
        heightFeet = hF;
        heightInch = hI;
    }

    /**
     * Converts to total height to total inches, and then height in cenimeters.
     */
    public void coversions()
    {
        double heightCM;
        double heightTotal;
        
        heightTotal = (heightFeet * 12) + heightInch;
        heightCM = heightTotal * 2.54;
        
        System.out.println("Your total height in inches is " + heightTotal + "in.");
        System.out.println("Your total height in centimeters is " + heightCM + "cm.");
    }
}
