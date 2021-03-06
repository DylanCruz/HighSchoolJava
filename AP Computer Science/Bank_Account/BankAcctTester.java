
/**
 * Write a description of class BankAcctTester here.
 * 
 * @author Dylan Cruz - Intern  
 * @version 1.0 (11/16/11)
 */
public class BankAcctTester
{
    
    public static void main(String [] args)
    {
        System.out.print("\f");
        System.out.println("Starting The Bank Account Program.");
        
        BankAcct dylan = new BankAcct("Dylan", 2000.00);
        BankAcct peter = new BankAcct("Peter", 10000.00);
        
        System.out.println();
        
        System.out.println("The amount of money in " + dylan.getNam() + "'s account is $" + dylan.getBal());
        System.out.println("The amount of money in " + peter.getNam() + "'s account is $" + peter.getBal());
        
        System.out.println();
        
        dylan.deposit(300.00);
        System.out.println("After a deposit of $300, the amount of money in " + dylan.getNam() + "'s account is $" + dylan.getBal());
        
        dylan.withdrawal(250.00);
        System.out.println("After a withdrawal of $250, he now has $" + dylan.getBal());
        
        System.out.println();
        
        dylan.setName("Steve");
        System.out.println("After legal issues, Dylan is now known as " + dylan.getNam());
        
        System.out.println();
        
        dylan.transfer(peter, 500);
        System.out.println("After " + dylan.getNam() + " transfers $500 to " + peter.getNam() + ", he now has $" + dylan.getBal() + " while peter has $" + peter.getBal()); 
    }

}
