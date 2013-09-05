
/**
 * Converst F to C.
 * 
 * @author Dylan Cruz
 * @version 1.0 (9/27/11)
 */
public class temperature
{
    
    private double tempF;
    

    /**
     * Constructor for objects of class temperature
     */
    public temperature(double tF)
    {
        // initialise instance variables
        tempF = tF;
    }

    /**
     * Converts degrees F to degrees C.
     */
    public void convertF()
    {
        double tempC;
        
        tempC = (tempF - 32) * 5 / 9;
        
        System.out.println("The temperature " + tempF + " degrees fahrenheit equals " + tempC + " degrees celcius.");
        
    }
}
