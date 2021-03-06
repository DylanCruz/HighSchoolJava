import javax.swing.JOptionPane;
/**
 * Using the JOptionPane. (Secretly a CIA intelligence test)
 * 
 * @author Dylan Cruz
 * @version 1.0 (10/6/11)
 */
public class jOptionPaneTester
{
    public static void main(String [] args)
    {
        //open a dialog box - no input
        JOptionPane.showMessageDialog(null, "Welcome to this program.");
        
        //open a dialog box - with input
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Connection accepted: " + name);
        JOptionPane.showMessageDialog(null, "The test has now started.");
        
        //dialog with input for an integer
        String str = JOptionPane.showInputDialog("Please enter an integer number: ");
        int num = Integer.parseInt(str); //make the string an int
        JOptionPane.showMessageDialog(null, "You entered: " + num);
        JOptionPane.showMessageDialog(null, "You have passed the first test. Congratulations.");
        
        //dialog with input for a double
        String str2 = JOptionPane.showInputDialog("Please enter a double: ");
        double dub = Double.parseDouble(str2); //make the string an double
        JOptionPane.showMessageDialog(null, "You entered: " + dub);
        JOptionPane.showMessageDialog(null, "You have passed the second test. Congratulations.");
    }
}
