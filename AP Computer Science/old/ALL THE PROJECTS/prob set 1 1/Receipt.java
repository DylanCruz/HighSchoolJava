
/**
 * Makes a receipt... duh.
 * 
 * @author Dylan Cruz 
 * @version 1.0 (9/23/11)
 */
public class Receipt
{
    /** instance variables
     *  tax rate
     */
        double taxRate;
    
    public Receipt()
    {
        // initialize instance variables
        taxRate = 0.08625;
        
    }
    

    /**
     * Print out a sales receipt
     * 
     * @param  price : price of an item for sale
     * @return      
     */
    public void printR(double price)
    {
        double total, tax;
        
        tax = price * taxRate;
        total = price + tax;
        
        System.out.println('\f');
        System.out.println("Subtotal: $" + price);
        System.out.println("Tax: $" + tax);
        System.out.println("__________");
        System.out.println("Total: $" + total);
        
    }
}
