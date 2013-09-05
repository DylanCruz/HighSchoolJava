import java.util.Scanner; //imports the scanner for use in the program.
/**
 * Checks if you are the chosen one. (demonstrate scanner class)
 * 
 * @author Dylan Cruz
 * @version 1.0 (10/5/11)
 */
public class scannerTest
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        double dec1, dec2;
        String firstName, lastName, fullName;
        
        System.out.print("\fPlease enter an integer number: ");
        num1 = keyboard.nextInt();
        System.out.println("The value of num1 is: " + num1);
        
        System.out.print("\nPlease enter a decimal number: ");
        dec1 = keyboard.nextDouble();
        System.out.println("The value of dec1 is: " + dec1);
        
        System.out.print("\nPlease enter your first name: ");
        firstName = keyboard.next();
        System.out.print("Please enter your last name: ");
        lastName = keyboard.next();
        System.out.println("The name you entered is: " + firstName + " " + lastName);
        
        System.out.print("\nPlease enter your full name: ");
        fullName = keyboard.nextLine(); //Get a new line
        fullName = keyboard.nextLine(); 
        System.out.print("Your full name is: " + fullName);
    }
}
